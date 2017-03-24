package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by timofeiKyksenok on 23.03.2017.
 */
public class ControllingInputter {
  private String string;

  public void input() {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      try {
        String string = reader.readLine();
        if(string.matches("^[1-3]{2}$")) {
          this.string = string;
          break;
        }
      } catch (IOException e) {
        System.out.println("Incorrect input");
      }
    }
  }

  public String getString() {
    return this.string;
  }
}
