package task09;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Class Tokenizator
 */
public class Tokenizator {
  private ArrayList list = new ArrayList();
  private String stringWithSpecSymbols = " /:";

  /**
   * Method tokenizating inputting string on spec symbols and return list strings between spec symbols
   * params String @string - string for separating
   * return ArrayList @list - strings between spec symbols
   */
  public ArrayList tokenizeOnSpecSymbols(String string) {
    StringTokenizer stringTokenizer = new StringTokenizer(string,stringWithSpecSymbols);
    while(stringTokenizer.hasMoreTokens()) {
      list.add(stringTokenizer.nextToken());
    }
    return list;
  }
}
 