import java.util.Scanner;

/**
 * Class to input data.
 */

class Inputer
{
/**
 * Constructor return filling string.
 */

  private Scanner stream = new Scanner(System.in);

  public String get() {
    return stream.nextLine();
  }
}