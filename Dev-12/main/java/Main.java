/**
 * Main class to call project.
 */
class Main {

/**
 * @return answer on question "Can the figure move to the specified coordinate. If Yes, for how many steps." in command line
 */
  public static void main(String[] args) {
    Validator validator = new Validator();
    Input input = new Input();
    Checker check = new Checker();
    Counter counter = new Counter();
    String color;
    String current;
    String wishful;

    System.out.print("Input figure color(w/b): ");
    color = input.get();
    if (validator.color(color) == false) {
        System.out.println("Inputting data is not valid color argument!");
        System.exit(1);
    }

    System.out.print("Input current coordinate: ");
    current = input.get();
    if (validator.length(current) == false | validator.cellCoordinate(current) == false) {
        System.out.println("Inputting data is not valid coordinate!");
        System.exit(1);
    }

    System.out.print("Input wishful coordinate: ");
    wishful = input.get();
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
  }
}