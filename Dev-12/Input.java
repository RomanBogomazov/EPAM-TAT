import java.util.Scanner;

/**
 * Class to input data of project
 */
class Input {
  private Scanner scan = new Scanner(System.in);

/**
 * @return data from command line
 */
  String get() {
    return scan.next();
  }
}