/** Main class. */

class Main
{

/** Main method. */

  public static void main(String[] args) {
    System.out.println("day-d, dd, ddd, dddd");
    System.out.println("month-M, MM, MMM, MMMM");
    System.out.println("year-y, yy, yyy, yyyy, yyyyy");
    System.out.println("hour-h, hh");
    System.out.println("minute-m, mm");
    System.out.print("Input date format: ");
    Input input = new Input();
    new Output(input.get());
  }
}