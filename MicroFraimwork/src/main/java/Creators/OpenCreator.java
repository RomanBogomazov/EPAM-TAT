package Creators;


import Commands.ICommand;
import Commands.Open;

public class OpenCreator implements ICreator {

  private ICreator nextInstructionCreator;
  private ICommand instruction;

  public OpenCreator(ICreator instructionCreator) {
    this.nextInstructionCreator = instructionCreator;
  }

  public ICommand getInstruction(String parameters) {
    String[] parametersArray = parameters.trim().split(" ", 2);
    if (parametersArray[0].trim().equalsIgnoreCase(CommandEnum.open.name())) {
      String[] arrayParameters = parametersArray[1].split(" ", 2);
      instruction = new Open(arrayParameters[0].replaceAll("[\"]", ""),
          Integer.parseInt(arrayParameters[1].trim().replaceAll("[\"]", "")));
    } else {
      instruction = nextInstructionCreator.getInstruction(parameters);
    }
    return instruction;
  }
}