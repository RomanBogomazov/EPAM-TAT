/**
 * Class to check conditions.
 */
class Checker{
    private int[] curr = new int[2];
    private int[] wish = new int[2];

/**
 * Check figures movement on one side.
 * @param color is figure color.
 * @param current is current figure position.
 * @param wishful is wishful figure position.
 * @return 
 */
  boolean get(String color, String current, String wishful) {
      curr[0] = current.charAt(0);
      wish[0] = wishful.charAt(0);
      curr[1] = current.charAt(1) - 48;
      wish[1] = wishful.charAt(1) - 48;

      if (canMovement(curr, wish) == true & canLive(curr) == true & canLive(wish) == true) {
          if (color.equals("w")) {
              if (wish[1] > curr[1]) {
                  return true;
              }
              else  {
                  return false;
              }
          }
          else {
              if (wish[1] < curr[1]) {
                  return true;
              }
              else  {
                  return false;
              }
          }
      }
      else {
          return false;
      }
  }

  /**
   * Check inputting coordinate on valid data.
   * @param coordinate is checker coordinates first: a-h and second: 1-8.
   * @return
   */
  boolean canLive(int[] coordinate) {
      if ((coordinate[0] + coordinate[1]) % 2 == 0) {
          return true;
      }
      else {
          return false;
      }
  }

  /**
   * Check coordinates on movement from one coordinate on second.
   * @param current current coordinates of checker.
   * @param wishful wishful coordinates of checker.
   * @return
   */
  boolean canMovement(int[] current, int[] wishful) {
      if (Math.abs(wishful[0] - current[0]) <= Math.abs(wishful[1] - current[1])) {
          return true;
      }
      else {
          return false;
      }
  }
}