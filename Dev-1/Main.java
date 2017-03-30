import java.util.*;

/**
 * Main class
 */

class Main {

/**
 * Main method.
 */

  public static void main(String[] args) {
    System.out.print("Input minimum 3 params to complete random task: ");

    Input input = new Input();
    Parser parse = new Parser();
    Validator valid = new Validator();
    Randomizer random = new Randomizer();
    String inputString = input.get();
    ArrayList<String> list = parse.get(inputString);
    ArrayList<String> randomList = random.get(list);

    if(valid.get(list) == true) {
      System.out.println(randomList);
    }
  }
}