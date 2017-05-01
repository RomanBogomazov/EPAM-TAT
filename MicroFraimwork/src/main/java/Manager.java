import Commands.ICommand;
import Creators.Creator;

public class Manager {

  private ICommand command;

  public void executeInstruction(String instruction) {
    Creator creator = new Creator();
    this.command = creator.getInstruction(instruction);
    this.command.Execute();
  }
}