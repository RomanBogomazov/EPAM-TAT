package Creators;

import Commands.Close;
import Commands.ICommand;

public class CloseCreator implements ICreator {

  private ICreator nextInstructionCreator;
  private ICommand instruction;

  public CloseCreator(ICreator instructionCreator) {
    this.nextInstructionCreator = instructionCreator;
  }

  public ICommand getInstruction(String parameters) {
    String[] parametersArray = parameters.trim().split(" ", 2);
    if (parametersArray[0].trim().equalsIgnoreCase(CommandEnum.close.name())) {
      instruction = new Close();
    } else {
      instruction = nextInstructionCreator.getInstruction(parameters);
    }
    return instruction;
  }
}