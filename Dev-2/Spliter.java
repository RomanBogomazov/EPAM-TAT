import java.util.*;

/**
 * Class to split text on symbols.
 */

class Spliter
{

/**
 * Method to split text on symbols.
 */

  private ArrayList<String> list = new ArrayList<String>();
  private int first = 0;

  public ArrayList<String> get(String text) {
    for(int i = 0; i < text.length(); i++) {
      if (i == text.length() - 1) {
        list.add(text.substring(first, text.length()));
      }
      if(text.charAt(i) == ' ') {
        list.add(text.substring(first, i));
        first = i + 1;
      }
    }
    return list;
  }
}