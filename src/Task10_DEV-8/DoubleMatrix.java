package Task10;

/**
 * Class Matrix
 */
public class DoubleMatrix {

  private int numberOfColumns;
  private int numberOfLines;
  private double[][] matrix;

  /**
   * Method for set matrix, number of columns, number of lines and write in internal fields
   * @params double[][] matrix
   * @params long numberOfColumns
   * @params long numberOfLines
   */
  public void setMatrix(double[][] matrix, int numberOfColumns, int numberOfLines) {
    this.matrix = matrix;
    this.numberOfColumns = numberOfColumns;
    this.numberOfLines = numberOfLines;
  }

  /**
   * Method for get number of columns
   * @return long numberOfColumns
   */
  public int getNumberOfColumns() {
    return numberOfColumns;
  }

  /**
   * Method for get number of lines
   * @return long numberOfLines
   */
  public int getNumberOfLines() {
    return numberOfLines;
  }

  /**
   * Method for get matrix
   * @return double[][] matrix
   */
  public double[][] getMatrix() {
    return matrix;
  }


}
