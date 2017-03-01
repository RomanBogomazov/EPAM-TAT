package frequency;

/**
 * Class for add new text to all text
 */
public class AddNewTextToAllText {
  
  /**
   * method for add new text to all text
   * param string of all text
   * param string of new text
   * return string with new full text
   */
  String AddNewTextToAllText(String allText, String newText) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(allText);
    stringBuilder.append(newText);
    stringBuilder.append(" ");
    return stringBuilder.toString();
  }
}
