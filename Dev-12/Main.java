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
    String currentCoord;
    String wishfulCoord;
    boolean[] criterion = new boolean[3];

    System.out.print("Input figure color(w/b): ");
    color = input.get();
    System.out.print("Input current coordinate: ");
    currentCoord = input.get();
    System.out.print("Input wishful coordinate: ");
    wishfulCoord = input.get();

    if(check.onLine(currentCoord, wishfulCoord) == true & check.Movement(color, currentCoord, wishfulCoord) == true) {
      System.out.println("Movement is possible on " + counter.simpleCounter(currentCoord, wishfulCoord) + " steps");
    }
    else {
      System.out.println("Movement is impossible");
    }
  }
}