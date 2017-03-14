/**
 * Main class to call project.
 */
class Main {

/**
 * @return answer on question "Can the figure move to the specified coordinate. If Yes, for how many steps." in command line
 */
  public static void main(String[] args) {
    Input input = new Input();
    Checker check = new Checker();
    Counter counter = new Counter();
    String color;
    String current;
    String wishful;

    System.out.print("Input figure color(w/b): ");
    color = input.get();
    System.out.print("Input current coordinate: ");
    current = input.get();
    System.out.print("Input wishful coordinate: ");
    wishful = input.get();

    if(check.Movement(color, current, wishful) == true) {
      System.out.println("Movement is possible on " + counter.simpleCounter(current, wishful) + " steps");
    }
    else {
      System.out.println("Movement is impossible");
    }
  }
}