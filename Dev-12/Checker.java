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
  boolean Movement(String color, String current, String wishful) {
      curr[0] = current.charAt(0);
      wish[0] = wishful.charAt(0);
      curr[1] = current.charAt(1);
      wish[1] = wishful.charAt(1);

      if (wish[0] - curr[0] <= wish[1] - curr[1] & (curr[0] + curr[1]) % 2 == 0 & (wish[0] + wish[1]) % 2 == 0) {
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
}