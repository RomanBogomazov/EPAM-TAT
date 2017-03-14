/**
 * class to count number of moves.
 */
class Counter {

/**
 * Counter for pawn.
 * @param current is current figure position.
 * @param wishful is wishful figure position.
 * @return count of moves from current to wishful position.
 */
  int simpleCounter(String current, String wishful){
      return Math.abs(wishful.charAt(1) - current.charAt(1));
  }
}