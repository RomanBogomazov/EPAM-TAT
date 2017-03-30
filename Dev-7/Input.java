import java.util.*;

/**
 * Class to input data.
 */

class Input {
  private Scanner scan = new Scanner(System.in);

/**
 * Method to input line from command line.
 */

  public String get() {
    return scan.nextLine();
  }
}