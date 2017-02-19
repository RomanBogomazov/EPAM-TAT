import java.util.*;

/** In this class programm initializeyd all classes and commands. */

class Main
{

/**
 * Main method.
 */

  public static void main(String[] args) {
    Input input = new Input();
    String cashString = new String();
    ArrayList<String> textList = new ArrayList<String>();
    Frequency freq = new Frequency();
    MoreFiveSymbols mfs = new MoreFiveSymbols();
    Output print = new Output();

    int count = 0;

    System.out.println("If you want to break input-write 'END'!!!");

    do {
      System.out.print("Input part of text: ");
      cashString = input.read();

        if(count>2) {
          if(!cashString.equals("END")) {
            textList.add(cashString);
            print.frequency(freq.get(cashString));
            print.countOfBiggestPairs(mfs.counter(cashString));
            count++;}
          else break;
        }

        else {
          if(!cashString.equals("END")) {
            textList.add(cashString);
            print.frequency(freq.get(cashString));
            print.countOfBiggestPairs(mfs.counter(cashString));
            count++;}
          else System.out.println("You must input minimum 3 parts of text."); 
        }
    } while(true);
  }
}