package Creators;

import Commands.CheckPageContains;
import Commands.ICommand;

public class CheckPageContainsCreator implements ICreator {

  private ICommand instruction;
  private ICreator nextInstructionCreator;

  public CheckPageContainsCreator(ICreator instructionCreator) {
    this.nextInstructionCreator = instructionCreator;
  }

  public ICommand getInstruction(String parameters) {
    String[] parametersArray = parameters.trim().split(" ", 2);
    if (parametersArray[0].trim().equalsIgnoreCase(CommandEnum.checkpagecontains.name())) {
      instruction = new CheckPageContains(
          parametersArray[1].trim().replaceAll("[\"]", ""));
    } else {
      instruction = nextInstructionCreator.getInstruction(parameters);
    }
    return instruction;
  }
}