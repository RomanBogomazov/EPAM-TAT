package frequency;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mainPC
 */
public class CheckAndOutputFrequency {
    Map<String, Integer> frequencyMap=new HashMap<String,Integer>();
    
    void CheckAndOutputFrequency(String newText){
        for (int i=0; i<newText.length(); i++){
            if(((newText.charAt(i) >= 'a')&&(newText.charAt(i) <= 'z'))&&((newText.charAt(i) >= 'a')&&(newText.charAt(i) <= 'z'))) {
                int count=frequencyMap.get(newText.substring(i,i+1));
                frequencyMap.put(newText.substring(i,i+1), count++);
            } 
        }
        for(Map.Entry<String, Integer> e : frequencyMap.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
