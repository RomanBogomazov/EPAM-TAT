package task04_dev.pkg3;

/**
 * Main class
 */
public class Task04_dev3 {

  /**
   * Main method - point of input of program.
   * Call methods of input of people information,
   *     output information abot average age, oldest man,
   *     most popular female name and people with one surname.
   */
  public static void main(String[] args) {
    People people = new People();
    people.InputInformation();
    OutputOldestAndAverage outputOldestAndAverage = new OutputOldestAndAverage();
    outputOldestAndAverage.OutputOldestAndAverage(people.getList());
    OutputMostPopulatFemaleName outputMostPopulatFemaleName = new OutputMostPopulatFemaleName();
    outputMostPopulatFemaleName.OutputMostPopulatFemaleName(people.getList());
    OutputPeopleWithOneSurname outputPeopleWithOneSurname = new OutputPeopleWithOneSurname();
    outputPeopleWithOneSurname.OutputPeopleWithOneSurname(people.getList());
    }
    
}
