package frequency;

/**
 * Main class of app
 */
public class Frequency {

    
  /**
   * Point of input in programm
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int iteration = 0;
    boolean repeat = true;
    int numforForAsk = 2;
    String allText = "";
    int numberOfWordsMoreFiveLitters = 0;
    while(repeat){
      Inputter inputter = new Inputter();
      String newText = inputter.Input();
      CheckerLine checkerLine = new CheckerLine();
      newText = checkerLine.checkForLettersAndSpaces(newText);
      AddNewTextToAllText addNewTextToAllText = new AddNewTextToAllText();
      allText = addNewTextToAllText.AddNewTextToAllText(allText, newText);
      CheckWordsForMoreFiveLitters checkWordsForMoreFiveLitters = new CheckWordsForMoreFiveLitters();
      numberOfWordsMoreFiveLitters += checkWordsForMoreFiveLitters.CheckWordsForMoreFiveLitters(newText);
      System.out.println("Number of words more five litters = " + numberOfWordsMoreFiveLitters);
      CheckAndOutputFrequency checkAndOutputFrequency = new CheckAndOutputFrequency();
      checkAndOutputFrequency.CheckAndOutputFrequency(allText);
      if (iteration>=numforForAsk) {
        AskForExit askForExit = new AskForExit();
        repeat = askForExit.askForExit();
      } else {
        iteration++;
      }
    }
  }    
}
