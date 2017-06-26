package code;

/**
 * Created by RomanBogomazov on 23.03.2017. Main class. Generate frame and 4 buttons on it: "Simple
 * computer", "Medium computer", "PvP" and "Back on main menu". First step do "X".
 */
public class Main {

  public static void main(String[] args) {
    try {
      new GUI();
    } catch (Exception e) {
      System.out.println("You have a problem!");
      System.out.println(e);
    }
  }
}