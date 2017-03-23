/**
 * Class to multiplicate matrix.
 */
class Multiplicater {
 
/**
 * Method return matrix-result of multiplicate matrix.
 * @mass - array of matrix.
 */
  private ElementOfMatrix element = new ElementOfMatrix();

  public double[][] get(double[][][] mass) {
    double[][] massResult = new double[mass[0][0].length][mass[0][0].length];
    for(int i = 0; i < mass[0].length; i++) {
      for(int j = 0; j < mass[0][0].length; j++) {
        massResult[i][j] = element.get(mass, j, i);
      }
    }
    return massResult;
  }
}