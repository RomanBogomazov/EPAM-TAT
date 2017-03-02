import java.util.*;

/**
 * Class parse string on params.
 */

class Parser {

/**
 * Method to parse string.
 * Inputting param - string with spaces.
 * Outputting param - list of params.
 */

  private ArrayList<String> list = new ArrayList<String>();
  private int first = 0;

  public ArrayList<String> get(String line) {
    for(int i = 0; i < line.length(); i++) {
      if(line.charAt(i) == ' ') {
        list.add(line.substring(first, i));
        first = i;
      }
      if(i == line.length() - 1) {
        list.add(line.substring(first, line.length()));
      }
    }
    return list;
  }
}