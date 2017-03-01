package frequency;

/**
 * Class for check words and output number of words consist of more then 5 letters
 */
public class CheckWordsForMoreFiveLitters {
    
  int lettersInPresentWord = 0;
  int numberOfWordsMoreFiveLitters = 0;
    
  /**
   * Metod for check words and output number of words consist of more then 5 letters
   * param string for check
   * return int number of of words consist of more then 5 letters
   */
  int CheckWordsForMoreFiveLitters(String string) {
    for(int i = 0; i < string.length(); i++) {
      if(lettersInPresentWord==0) {
        if((string.charAt(i) >= 'a')&&(string.charAt(i) <= 'z')) {
          lettersInPresentWord++; 
          }
        } else {
        if((string.charAt(i) >= 'a')&&(string.charAt(i) <= 'z')&&(string.length()!=(i+1))) {
          lettersInPresentWord++;
        } else {
          if(lettersInPresentWord>5){
            numberOfWordsMoreFiveLitters++;  
          }
          lettersInPresentWord=0;
        }
      }
    }
    return numberOfWordsMoreFiveLitters;
  }
}
