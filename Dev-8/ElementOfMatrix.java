/**
 * Class to determenetion one elemnt of matrix.
 */
class ElementOfMatrix {
  private double element = 0;

/**
 * Method determiny elment of matrix and return it.
 */
  public double get(double[][][] mass, int lineNumber, int rawNumber) {
    for(int k = 0; k < mass[0][0].length; k++) {
      element += mass[0][lineNumber][k] * mass[1][k][rawNumber];
    }
    return element;
  }
}