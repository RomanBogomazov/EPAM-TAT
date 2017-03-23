import java.util.*;

/** Class to count words which consisted more than 5 symbols. */

class MoreFiveSymbols
{    

/** Method to identify word which consisted more than 5 symbols. */

  private boolean identify(String text) {
    if(text.length() > 5) return true;
    else return false;
  }

/** Method to count words which consisted more than 5 symbols. */

  public int counter(String textpart) {
    int count = 0;
    ArrayList<String> list = new ArrayList<String>();
    Spliter split = new Spliter(textpart, list);

    for (int i = 0; i < list.size(); i++)
        if(identify(list.get(i)) == true) count++;

    return count;
  }
}