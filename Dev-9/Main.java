import java.util.*;

/**
 * Main class which initialize project.
 */

class Main {

/**
 * Main method.
 */

  public static void main(String[] args) {
    Input input = new Input();
    Parser parse = new Parser();
    System.out.print("Input section name: ");
    String text = input.getFileData(args[0]);
    ArrayList<String> list = parse.getListOfSections(text);
    ArrayList<String> keyList = parse.getListOfKeys(input.getSectionName(), list);

    System.out.print("Choose one of this params " + keyList + ": ");
    String valueParam = parse.getValueOfParam(input.getKeyName());


    System.out.print("Value of your choosing param: " + valueParam);
  }
}