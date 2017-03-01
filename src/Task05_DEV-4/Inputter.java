package frequency;

import java.util.Scanner;

/**
 * Class of input of programm
 */
public class Inputter {

  /**
   * Method of input of programm
   * return string which was inputting
   */
  String Input() {
    System.out.println("Input new text");
    Scanner in = new Scanner(System.in);
    String string=in.nextLine().toLowerCase();
    return string;
  }
}
