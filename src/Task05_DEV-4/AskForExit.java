package frequency;

import java.util.Scanner;

/**
 * Class for ask, if user want to repeat
 */
public class AskForExit {
  
  /**
   * Method for ask, if user want to repeat
   * return boolean true if wanted to repeat
   */
  boolean askForExit() {
    boolean repeat = true;
    System.out.println("Do you want to repeat?(true/false)");
    Scanner in = new Scanner(System.in);
    String string=in.nextLine();
    if(string.equals("true")) {
      repeat = true;
    } else {
      repeat = false;
    }
    return repeat;
  }
}
