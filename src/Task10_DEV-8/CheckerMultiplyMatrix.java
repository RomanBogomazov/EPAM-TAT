package Task10;

/**
 * Class for check matrixs for multiplying
 */
public class CheckerMultiplyMatrix {

  /**
   * Method for check matrix for multiply (A*B)
   *
   * @params firstMatrix - for multiply(how A)
   * @params secondMatrix - for multiply(how B)
   * @return boolean - true, if multiply possible; false, if multiply impossible.
   */
  public boolean check(DoubleMatrix firstMatrix, DoubleMatrix secondMatrix) {
    if (firstMatrix.getNumberOfColumns() == secondMatrix.getNumberOfLines()) {
      return true;
    } else {
      return false;
    }
  }
}
