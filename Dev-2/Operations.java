import java.util.*;

/**
 * Class do arithmetic operations elements on list.
 */

class Operations {

/**
 * Method has input param @list - list of elements which included numbers and operation symbols.
 * Like output param is @list - input param, but sorted and get operations.
 * In first cycle method multiply and divide numbers of @list.
 * In second cycle method summary and subtract numbers of @list.
 */

  public ArrayList<String> get(ArrayList<String> list) {
    for(int i = 0; i < list.size(); i++) {
      if(list.get(i).equals("*")) {
        list.set(i, String.valueOf(Double.valueOf(list.get(i - 1)) * Double.valueOf(list.get(i + 1))));
        list.remove(i + 1);
        list.remove(i - 1);
        i = 0;
      }
      if(list.get(i).equals("/")) {
        list.set(i, String.valueOf(Double.valueOf(list.get(i - 1)) / Double.valueOf(list.get(i + 1))));
        list.remove(i + 1);
        list.remove(i - 1);
        i = 0;
      }
    }

    for(int i = 0; i < list.size(); i++) {
      if(list.get(i).equals("+")) {
        list.set(i, String.valueOf(Double.valueOf(list.get(i - 1)) + Double.valueOf(list.get(i + 1))));
        list.remove(i + 1);
        list.remove(i - 1);
        i = 0;
      }
      if(list.get(i).equals("-")) {
        list.set(i, String.valueOf(Double.valueOf(list.get(i - 1)) - Double.valueOf(list.get(i + 1))));
        list.remove(i + 1);
        list.remove(i - 1);
        i = 0;
      }
    }
    return list;
  }
}