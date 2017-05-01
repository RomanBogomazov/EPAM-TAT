package Creators;

import Commands.CheckLinkPresentByHref;
import Commands.ICommand;

public class CheckLinkPresentByHrefCreator implements ICreator {

  private ICreator nextInstructionCreator;
  private ICommand instruction;

  public CheckLinkPresentByHrefCreator(ICreator instructionCreator) {
    this.nextInstructionCreator = instructionCreator;
  }

  public ICommand getInstruction(String parameters) {
    String[] parametersArray = parameters.trim().split(" ", 2);
    if (parametersArray[0].trim().equalsIgnoreCase(CommandEnum.checklinkpresentbyhref.name())) {
      instruction = new CheckLinkPresentByHref(
          parametersArray[1].trim().replaceAll("[\"]", ""));
    } else {
      instruction = nextInstructionCreator.getInstruction(parameters);
    }
    return instruction;
  }
}