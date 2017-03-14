/**
 * Class to check conditions.
 */
class Checker{

/**
 * Check positions on location figures on one line.
 * @current is current figure position.
 * @wishful is wishful figure position.
 * @return 
 */
  boolean onLine(String current, String wishful) {
    if(current.charAt(0) == wishful.charAt(0)) {
      return true;
    }
    else {
      return false;
    }
  }

/**
 * Check figures movement on one side.
 * @color is figure color.
 * @current is current figure position.
 * @wishful is wishful figure position.
 * @return 
 */
  boolean Movement(String color, String current, String wishful) {
    if(color.equals("w")) {
      if(current.charAt(1) < wishful.charAt(1)) {
        return true;
      }
      else {
        return false;
      }
    }
    else {
      if(current.charAt(1) > wishful.charAt(1)) {
        return true;
      }
      else {
        return false;
      }
    }
  }
}