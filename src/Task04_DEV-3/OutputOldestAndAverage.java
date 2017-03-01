package task04_dev.pkg3;

import java.util.ArrayList;

/**
 * Class for output oldest man and average age
 */
public class OutputOldestAndAverage {
    
  byte oldest = 0;
  double sumOfAge = 0;
  double averageAge = 0;

  /**
   * Method for output oldest man and average age
   * @param list of man
   */
  protected void OutputOldestAndAverage(ArrayList<Man> list) {
    Man oldestMan = list.get(0);
    for(Man man: list){
      sumOfAge = sumOfAge + man.getAge();
      if (oldest < man.getAge()) 
      {
        oldest = man.getAge();
        oldestMan = man;          
      }
    }
    averageAge = sumOfAge/list.size();
    System.out.println("Average age is " + averageAge);
    System.out.println("Oldest man is " + oldestMan.getName() + " " + oldestMan.getSurname()+ " " + oldestMan.getGender() + " " + oldestMan.getAge());
  }
}
