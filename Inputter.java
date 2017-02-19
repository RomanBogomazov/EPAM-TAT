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
    Scanner in = new Scanner(System.in);
    String string=in.nextLine().toLowerCase();
    System.out.println(string);
    return string;
  }
}
