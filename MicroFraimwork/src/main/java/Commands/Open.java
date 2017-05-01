package Commands;

public class Open implements ICommand{
  private String url;
  private int timeout;

  public Open(String url, int timeout) {
    this.url = url;
    this.timeout = timeout;
  }

  public void Execute() {
  }
}