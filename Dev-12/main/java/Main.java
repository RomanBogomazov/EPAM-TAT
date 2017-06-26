import java.util.Scanner;

/**
 * Main class to call project.
 */
class Main {

/**
 * @return answer on question "Can the figure move to the specified coordinate. If Yes, for how many steps." in command line
 */
  public static void main(String[] args) {
    try{
      Validator validator = new Validator();
      Scanner scan = new Scanner(System.in);
      Checker check = new Checker();
      Counter counter = new Counter();
      String color;
      String current;
      String wishful;

      System.out.print("Input figure color(w/b): ");
      color = scan.next();
      if (validator.color(color) == false) {
        System.out.println("Inputting data is not valid color argument!");
        System.exit(1);
      }

      System.out.print("Input current coordinate: ");
      current = scan.next();
      if (validator.length(current) == false | validator.cellCoordinate(current) == false) {
        System.out.println("Inputting data is not valid coordinate!");
        System.exit(1);
      }

      System.out.print("Input wishful coordinate: ");
      wishful = scan.next();
      if (validator.length(wishful) == false | validator.cellCoordinate(wishful) == false) {
        System.out.println("Inputting data is not valid coordinate!");
        System.exit(1);
      }

      if(check.get(color, current, wishful) == true) {
        System.out.println("Movement is possible on " + counter.simpleCounter(current, wishful) + " steps");
      }
      else {
        System.out.println("Movement is impossible");
      }
    } catch (Exception e) {
      System.out.println("You have problems!!!");
    }
  }
}