import java.util.*;

/**
 * Main class.
 */
public class List {

/**
 * Main method.
 * @return results of operations: average and max age of person, the most popular female name, all namesakes.
 */
  public static void main(String[] args) {
    Input input = new Input();
    System.out.print("Input count of person: ");
    int count = input.getCountOfPerson();
    Person[] persons = new Person[count];
    Average avg = new Average();
    MaxAge maxAge = new MaxAge();
    PopularFemaleName pfn = new PopularFemaleName();

    for(int i = 0; i < count; i++) {
      persons[i] = new Person();
      input.getPerson(persons[i]);
      System.out.println();
    }

    System.out.println();
    System.out.println("Average: " + avg.get(persons));
    System.out.println("Max age: " + maxAge.get(persons));
    System.out.println("Popular female name: " + pfn.get(persons));
  }
}