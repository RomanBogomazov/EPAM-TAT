package Task10;

import java.math.BigDecimal;

/**
 * Created by main on 02.03.2017.
 */
public class Multiplicater {

  public void multiplyMatrix(DoubleMatrix firstMatrix, DoubleMatrix secondMatrix,  BigDecimalMatrix resoultingMatrix) {
    BigDecimal [][] massiv = new BigDecimal[firstMatrix.getNumberOfLines()][secondMatrix.getNumberOfColumns()];
    for(int i = 0; i < firstMatrix.getNumberOfLines(); i++) {
      for(int j = 0; j < secondMatrix.getNumberOfColumns(); j++) {
        massiv[i][j] = new BigDecimal("0");
        for(int k = 0; k < firstMatrix.getNumberOfColumns();k++) {
          String stringValueInFirstMatrix = String.valueOf(firstMatrix.getMatrix()[i][k]);
          BigDecimal bigDecimalValueInFirstMatrix = new BigDecimal(stringValueInFirstMatrix);
          String stringValueInSecondMatrix = String.valueOf(secondMatrix.getMatrix()[k][j]);
          BigDecimal bigDecimalValueInSecondMatrix = new BigDecimal(stringValueInSecondMatrix);
          massiv[i][j] = massiv[i][j].add(bigDecimalValueInFirstMatrix.multiply(bigDecimalValueInSecondMatrix));
        }
      }
      System.out.println();
    }
    resoultingMatrix.setMatrix(massiv, secondMatrix.getNumberOfColumns(),firstMatrix.getNumberOfLines());
  }
}
