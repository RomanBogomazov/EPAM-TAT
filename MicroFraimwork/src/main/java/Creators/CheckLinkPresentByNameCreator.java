package Creators;

import Commands.CheckLinkPresentByName;
import Commands.ICommand;

public class CheckLinkPresentByNameCreator implements ICreator {

  private ICreator nextInstructionCreator;
  private ICommand instruction;

  public CheckLinkPresentByNameCreator(ICreator instructionCreator) {
    this.nextInstructionCreator = instructionCreator;
  }

  public ICommand getInstruction(String parameters) {
    String[] parametersArray = parameters.trim().split(" ", 2);
    if (parametersArray[0].trim().equalsIgnoreCase(CommandEnum.checklinkpresentbyname.name())) {
      instruction = new CheckLinkPresentByName(
          parametersArray[1].trim().replaceAll("[\"]", ""));
    } else {
      instruction = nextInstructionCreator.getInstruction(parameters);
    }
    return instruction;
  }
}