import java.util.*;

/**
 * Class to randomize params.
 */

class Randomizer {

/**
 * Method give like input param ArrayList with "params" and output ArrayList with randomizing params.
 */

  ArrayList<String> randomList = new ArrayList<String>();
  private int randomIndex = 0;

  public ArrayList<String> get(ArrayList<String> list) {
    for(int i = 0; i < 3; i++) {
      randomIndex = (int)(Math.random() * list.size());
      randomList.add(list.get(randomIndex));
    }

    return randomList;
  }
}