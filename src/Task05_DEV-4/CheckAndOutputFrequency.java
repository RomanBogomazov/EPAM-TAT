package frequency;

import java.util.HashMap;
import java.util.Map;

/**
 * Class for check and output frequency
 */
public class CheckAndOutputFrequency {

  Map<String, Integer> frequencyMap=new HashMap<String,Integer>();
  
  /**
   * Method for check and output frequency
   * param string for check frequency
   */
  void CheckAndOutputFrequency(String newText){
    for (int i=0; i<newText.length(); i++){
      if(((newText.charAt(i) >= 'a')&&(newText.charAt(i) <= 'z'))&&((newText.charAt(i+1) >= 'a')&&(newText.charAt(i+1) <= 'z'))) {
        int count;
        if(frequencyMap.containsKey(newText.substring(i,i+2))) {
          count=frequencyMap.get(newText.substring(i,i+2));
        } else {
          count=0;
        }
        count++;
        frequencyMap.put(newText.substring(i,i+2), count);
      } 
    }
    for(Map.Entry<String, Integer> e : frequencyMap.entrySet()) {
      System.out.println(e.getKey());
      System.out.println(e.getValue());
    }
  }
}
