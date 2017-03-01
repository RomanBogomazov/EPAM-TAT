package task04_dev.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class with all information about people
 */
public class People {

  public ArrayList<Man> list = new ArrayList<>();
  String name, surname;
  char gender;
  byte age;
    
  /**
   * 
   */
  public void InputInformation(){
    Scanner in = new Scanner(System.in);
    boolean repeat = true;
    while (repeat) {
    System.out.print("Input Name: ");
    name = in.next();
    System.out.print("Input Surame: ");
    surname = in.next();
    System.out.print("Input Gender m(male)/f(female): ");
    gender = in.next().charAt(0);
    if(!((gender == 'm')||(gender == 'f'))) System.exit(2);
    System.out.print("Input Age: ");
    age = in.nextByte();
    list.add(new Man(name, surname, gender, age));
    System.out.print("Do you want to write a new people?(true/false)");
    repeat = in.nextBoolean();
    }
  }

  /**
   * 
   */
  public ArrayList<Man> getList() {
    return list;
  }
}
