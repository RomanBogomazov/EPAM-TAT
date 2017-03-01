package frequency;

/**
 * Class for check line for the wrong values and removes them
 */
public class CheckerLine {
  
  /**
   * Method for check line for the wrong values and removes them
   * param string for check
   * return string checked 
   */
  String checkForLettersAndSpaces(String string) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < string.length(); i++) {
      if (((string.charAt(i) >= 'a')&&(string.charAt(i) <= 'z'))||(string.charAt(i)==' '))
      stringBuilder.append(string.charAt(i));
      }
    return stringBuilder.toString();
  } 
}
