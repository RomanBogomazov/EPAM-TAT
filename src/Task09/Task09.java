package task09;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Main class
 */
public class Task09 {

  /**
   * Method main for check inputting string for our format
   * return to consol information about check
   */
  public static void main(String[] args) throws Exception {
    Inputter inputter = new Inputter();
    String string = inputter.input();
    Checker checker = new Checker();
    checker.check(string);
    Tokenizator tokenizator = new Tokenizator();
    ArrayList list = tokenizator.tokenizeOnSpecSymbols(string);
    if(checker.firstGeneralCheck(list)) {
      System.out.println("First check say good");
      if(checker.generalCheck(list)) {
        System.out.println("All so good");
      } else {
        System.out.println("All is not good");
      }
    } else {
      System.out.println("First check say not good");
    }
  }
}
