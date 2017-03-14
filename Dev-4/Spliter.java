import java.util.*;

/** Class to split string on words. */

class Spliter
{

/** Constructor split string and add words at list. */

  Spliter(String text, ArrayList<String> list) {
    int count = 0;
    int[] spaces = new int[text.length()];

    for(int i=0; i<text.length(); i++)
      if(text.charAt(i) == ' ') {
        spaces[count] = i;
        count++; 
       }

    if(count > 0) {
      list.add(text.substring(0, spaces[0]));
      for(int i = 0; i < count - 1; i++)
        list.add(text.substring(spaces[i], spaces[i+1]));

      list.add(text.substring(spaces[count-1], text.length()));
    }
    else list.add(text);
  }
}