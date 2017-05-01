package Commands;

public class CheckLinkPresentByName implements ICommand {

  private String linkName;

  public CheckLinkPresentByName(String linkName) {
    this.linkName = linkName;
  }

  public void Execute() {
  }
}