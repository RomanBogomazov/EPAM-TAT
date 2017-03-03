package Task10;

import java.math.BigDecimal;

/**
 * Class for matrix multiplication
 */
public class Multiplicater {

  /**
   * Method for multiply matrix(A*B=C). Take matrices firstMatrix and secondMatrix, multiplying, and
   * record the result in a matrix resoultingMatrix
   *
   * @params firstMatrix - for multiply(how A)
   * @params secondMatrix - for multiply(how B)
   * @params resoultingMatrix - for resoult of multiplying(how C)
   */
  public void multiplyMatrix(DoubleMatrix firstMatrix, DoubleMatrix secondMatrix, BigDecimalMatrix resoultingMatrix) {
    BigDecimal[][] array = new BigDecimal[firstMatrix.getNumberOfLines()][secondMatrix.getNumberOfColumns()];
    for (int i = 0; i < firstMatrix.getNumberOfLines(); i++) {
      for (int j = 0; j < secondMatrix.getNumberOfColumns(); j++) {
        array[i][j] = new BigDecimal("0");
        for (int k = 0; k < firstMatrix.getNumberOfColumns(); k++) {
          String stringValueInFirstMatrix = String.valueOf(firstMatrix.getMatrix()[i][k]);
          BigDecimal bigDecimalValueInFirstMatrix = new BigDecimal(stringValueInFirstMatrix);
          String stringValueInSecondMatrix = String.valueOf(secondMatrix.getMatrix()[k][j]);
          BigDecimal bigDecimalValueInSecondMatrix = new BigDecimal(stringValueInSecondMatrix);
          array[i][j] = array[i][j].add(bigDecimalValueInFirstMatrix.multiply(bigDecimalValueInSecondMatrix));
        }
      }
    }
    resoultingMatrix.setMatrix(array, secondMatrix.getNumberOfColumns(), firstMatrix.getNumberOfLines());
  }
}
