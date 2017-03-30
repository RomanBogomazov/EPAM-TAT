import java.util.*;

/** Now only drop input string. */

public class Calculator
{

/**
 * Main method.
 */

  public static void main(String[] args) {
    Inputer input = new Inputer();
    System.out.print("Input arithmetic expression in infix form: ");
    String text = input.get();
    Spliter split = new Spliter();
    ArrayList<String> list = split.get(text);
    Operations operation = new Operations();

    operation.get(list);
    System.out.println("Your answer: " + list);
  }
}
