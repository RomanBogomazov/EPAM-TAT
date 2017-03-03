import java.util.*;

/**
 * Input personal information.
 */
class Input {
  private Scanner scan = new Scanner(System.in);
  
  public int getCountOfPerson(){
    return scan.nextInt();
  }

  public Person getPerson(Person person) {
    System.out.print("First name: ");
    person.name = scan.next();
    System.out.print("Second name: ");
    person.sername = scan.next();
    System.out.print("Sex(male/female): ");
    person.sex = scan.next();
    System.out.print("Age: ");
    person.age = scan.nextByte();

    return person;
  }
}