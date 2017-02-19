import java.util.*;

/** Class to decide task: the frequency of occurrence of pairs of letters (Spaces are ignored, other symbols are not). */

class Frequency
{

/** Method to return list of pairs. */

  public ArrayList<String> get(String text){
    ArrayList<String> letterList = new ArrayList<String>();
    ArrayList<String> freqList = new ArrayList<String>();    //List stored pairs.
    Spliter split = new Spliter(text, letterList);
    compain(letterList, freqList);

    return freqList;
  }

/** Method to compain pairs grom letter on list. */

  private void compain(ArrayList<String> letterList, ArrayList<String> list) {
    for (int i = 0; i < letterList.size(); i++) {
      char cash1;
      char cash2;
      
      for(int j = 0; j < letterList.get(i).length() - 1; j++) {
        cash1 = letterList.get(i).charAt(j);
        cash2 = letterList.get(i).charAt(j+1);
       // list.add(cash1 + cash2);
      }
    }
  }
}