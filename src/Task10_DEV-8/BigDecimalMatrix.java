package Task10;

import java.math.BigDecimal;

/**
 * Class for matrix consist of Bigdecimal elements
 */
public class BigDecimalMatrix {

  private int numberOfColumns;
  private int numberOfLines;
  private BigDecimal[][] matrix;

  /**
   * Method for set matrix, number of columns, number of lines and write it all in internal fields
   *
   * @params matrix
   * @params numberOfColumns
   * @params numberOfLines
   */
  public void setMatrix(BigDecimal[][] matrix, int numberOfColumns, int numberOfLines) {
    this.matrix = matrix;
    this.numberOfColumns = numberOfColumns;
    this.numberOfLines = numberOfLines;
  }

  /**
   * Method for get number of columns
   *
   * @return int - number of columns
   */
  public int getNumberOfColumns() {
    return numberOfColumns;
  }

  /**
   * Method for get number of lines
   *
   * @return int - number of lines
   */
  public int getNumberOfLines() {
    return numberOfLines;
  }

  /**
   * Method for get matrix
   *
   * @return BigDecimal[][]
   */
  public BigDecimal[][] getMatrix() {
    return matrix;
  }
}
