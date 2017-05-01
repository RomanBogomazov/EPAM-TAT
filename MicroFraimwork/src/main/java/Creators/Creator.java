package Creators;


import Commands.ICommand;

public class Creator {

  private ICreator instructionCreator;

  public ICommand getInstruction(String instructionParameters) {
    instructionCreator = new CheckLinkPresentByHrefCreator(
        new CheckLinkPresentByNameCreator(
            new CheckPageContainsCreator(
                new CheckPageTitleCreator(
                    new OpenCreator(
                        new CloseCreator(null))))));
    return instructionCreator.getInstruction(instructionParameters);
  }
}