package task04_dev.pkg3;

import java.util.ArrayList;

/**
 * Class whitch output people with one surname
 */
public class OutputPeopleWithOneSurname {


  /**
   * Method for output people with one surname
   * @param list of man
   */
  public void OutputPeopleWithOneSurname(ArrayList<Man> list) {
    int[][] arrayOfIdAndNumberOfMention = new int[list.size()][1];
    for(int i = 0; i< list.size();i++){
      for(Man man: list){
        if(list.get(i).getSurname().equals(man.getSurname())) {
          arrayOfIdAndNumberOfMention[i][0]=arrayOfIdAndNumberOfMention[i][0]+1;
        }
      }
    }
    int numberOfMention = 1;
    for(int i = 0; i< list.size();i++){
      if(arrayOfIdAndNumberOfMention[i][0]> numberOfMention) {
        System.out.println("people with one surname " + list.get(i).getName() + " " + list.get(i).getSurname()+ " " + list.get(i).getGender() + " " + list.get(i).getAge());
      }
    }
  }
}
