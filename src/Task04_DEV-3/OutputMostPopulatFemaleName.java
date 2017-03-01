package task04_dev.pkg3;

import java.util.ArrayList;

/**
 * Class for output most population female name
 */
public class OutputMostPopulatFemaleName {

  /**
   * Method for output most population female name
   * @param list of man
   */
  public void OutputMostPopulatFemaleName(ArrayList<Man> list) {
    int numberOfMention = 0;
    int idMostPopulationName = 0;
    int[][] arrayOfIdAndNumberOfMention = new int[list.size()][1];
    for(int i = 0; i< list.size();i++){
      for(Man man: list){
        if((list.get(i).getName().equals(man.getName()))&&(list.get(i).getGender() == 'f')) {
          arrayOfIdAndNumberOfMention[i][0]=arrayOfIdAndNumberOfMention[i][0]+1;
        }
        if ((arrayOfIdAndNumberOfMention[i][0]>numberOfMention)&&(list.get(i).getGender() == 'f')) {
          numberOfMention = arrayOfIdAndNumberOfMention[i][0];
          idMostPopulationName = i;
        }
      }
    }
    int numberOfIdenticalNumberOfMention = 0;
    for(int i = 0; i< list.size();i++){
      if((arrayOfIdAndNumberOfMention[i][0]==numberOfMention)&&(list.get(i).getGender() == 'f')) {
        numberOfIdenticalNumberOfMention++;
      }
    }
    if(numberOfIdenticalNumberOfMention == numberOfMention&&(list.get(idMostPopulationName).getGender() == 'f')) {
      System.out.println("Most popular female name is " + list.get(idMostPopulationName).getName());
    }
    else
    {
      System.out.println("We hasnot the most popular female name ");
    }
  }
}
