import java.util.*;

/**
 * Class inpud string of params.
 */

class Input {
  private Scanner scan = new Scanner(System.in);

/**
 * Method return string inputtong from command line.
 */

  public String get() {
    return scan.nextLine();
  }
}