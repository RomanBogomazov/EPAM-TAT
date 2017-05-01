package Creators;

import Commands.ICommand;

public interface ICreator {

  ICommand getInstruction(String parameters);

}