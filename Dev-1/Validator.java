import java.util.*;

/**
 * Class to valid params on count more than 2.
 */

class Validator {

/** 
 * Method which validate list.
 */

  public boolean get(ArrayList<String> list) {
    if(list.size() > 2) {
      return true;
    }
    else {
      System.out.println("Input more params!");
      return false;
    }
  }
}