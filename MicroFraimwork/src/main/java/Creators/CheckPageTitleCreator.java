package Creators;

import Commands.CheckPageTitle;
import Commands.ICommand;

public class CheckPageTitleCreator implements ICreator {

  private ICreator nextInstructionCreator;
  private ICommand instruction;

  public CheckPageTitleCreator(ICreator instructionCreator) {
    this.nextInstructionCreator = instructionCreator;
  }

  public ICommand getInstruction(String parameters) {
    String[] parametersArray = parameters.trim().split(" ", 2);
    if (parametersArray[0].trim().equalsIgnoreCase(CommandEnum.checkpagetitle.name())) {
      instruction = new CheckPageTitle(parametersArray[1].trim().replaceAll("[\"]", ""));
    } else {
      instruction = nextInstructionCreator.getInstruction(parameters);
    }
    return instruction;
  }
}