/**
 * Class to check conditions.
 */
class Checker{
    private int[] curr = new int[2];    //array consist coordinates of current position in ASCII. example for "a1": curr[0] = 98, curr[1] = 49.
    private int[] wish = new int[2];    //array consist coordinates of wishful position in ASCII.
    private boolean answer = false;

/**
 * @param color is figure color.
 * @param current is current figure position.
 * @param wishful is wishful figure position.
 * @return answer on a question: "Can sword movement if it has choosing color?"
 */
  boolean get(String color, String current, String wishful) {
      curr[0] = current.charAt(0);      //current symbol of position in ASCII, for example: 'a' in 'a1'
      wish[0] = wishful.charAt(0);      //wishful symbol
      curr[1] = current.charAt(1) - 48;     //current number of position in ASCII, for example: '1' in 'a1'. magic number '48' - number of symbol
      wish[1] = wishful.charAt(1) - 48;     //wishful number

      if (canMovement(curr, wish) == true & canLive(curr) == true & canLive(wish) == true) {
          if (color.equals("w")) {
              if (wish[1] > curr[1]) {
                  answer = true;
              }
          }
          else {
              if (wish[1] < curr[1]) {
                  answer = true;
              }
          }
      }
      return answer;
  }

  /**
   * @param coordinate is checker coordinates first: a-h and second: 1-8.
   * @return answer on a question: "Can sword live?"
   */
  boolean canLive(int[] coordinate) {
      boolean answer = false    ;
      if ((coordinate[0] + coordinate[1]) % 2 == 0) {
          answer = true;
      }
      return answer;
  }

  /**
   * @param current current coordinates of checker.
   * @param wishful wishful coordinates of checker.
   * @return answer on a question: "Can sword movement?"
   */
  boolean canMovement(int[] current, int[] wishful) {
      boolean answer = false;
      int absoluteNumberOfCoordinate = Math.abs(wishful[1] - current[1]);
      int absoluteSymbolOfCoordinate = Math.abs(wishful[0] - current[0]);

      if (absoluteSymbolOfCoordinate <= absoluteNumberOfCoordinate) {
          answer = true;
      }
      return answer;
  }
}