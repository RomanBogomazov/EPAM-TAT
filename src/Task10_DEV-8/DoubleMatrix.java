package Task10;

/**
 * Class for matrix consist of double elements
 */
public class DoubleMatrix {

  private int numberOfColumns;
  private int numberOfLines;
  private double[][] matrix;

  /**
   * Method for set matrix, number of columns, number of lines and write it all in internal fields
   *
   * @params matrix
   * @params numberOfColumns
   * @params numberOfLines
   */
  public void setMatrix(double[][] matrix, int numberOfColumns, int numberOfLines) {
    this.matrix = matrix;
    this.numberOfColumns = numberOfColumns;
    this.numberOfLines = numberOfLines;
  }

  /**
   * Method for get number of columns
   *
   * @return int - number of columns from internal fields
   */
  public int getNumberOfColumns() {
    return numberOfColumns;
  }

  /**
   * Method for get number of lines
   *
   * @return int - number of lines from internal fields
   */
  public int getNumberOfLines() {
    return numberOfLines;
  }

  /**
   * Method for get matrix
   *
   * @return double[][] - matrix whith elements from internal fields
   */
  public double[][] getMatrix() {
    return matrix;
  }


}
