import java.util.Scanner;

/**
 * Class to input data of project
 */
class Input {
  private Scanner scan = new Scanner(System.in);
  private String input;

/**
 * @return data from command line
 */
  String get() {
      input = scan.nextLine();
      return input;
  }
}