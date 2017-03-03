package task09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class Inputter
 */
public class Inputter {

  /**
   * Method output format date and examples of date and return inputting string
   * return String @string - date which user input
   */
  public String input() throws IOException{
    System.out.println("Input time and date in format: (day)/(month)/(year) (hour):(minutes):(seconds)");
    System.out.println("Example: 21/3/2000 12:01:07");
    System.out.println("Example: 2/3/245000 1:01:00");
    System.out.println("Example: 21/8/20 2:1:7");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String string = reader.readLine();
    return string;
  }
}
