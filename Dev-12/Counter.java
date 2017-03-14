/**
 * class to count number of moves.
 */
class Counter {

/**
 * Counter for pawn.
 * @current is current figure position.
 * @wishful is wishful figure position.
 */
  int simpleCounter(String current, String wishful){
    if(wishful.charAt(1) > current.charAt(1)) {
      return wishful.charAt(1) - current.charAt(1);
    }
    else {
      return current.charAt(1) - wishful.charAt(1);
    }
  }
}