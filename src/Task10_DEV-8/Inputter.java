package Task10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Class for input matrix
 */
public class Inputter {

  /**
   * Method for input from keybord number of columns of matrix, numbers of lines of matrix, elements
   * of matrix and write thats all to matrix
   *
   * @params matrix
   */
  public void input(DoubleMatrix matrix) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input matrix");
    int numberOfColumns = inputIntNumberOf(reader, "Columns");
    int numberOfLines = inputIntNumberOf(reader, "Lines");
    double inputtingMatrix[][] = inputMatrix(reader, numberOfColumns, numberOfLines);
    matrix.setMatrix(inputtingMatrix, numberOfColumns, numberOfLines);
  }

  /**
   * Method for input  elements of matrix and return array of elements
   *
   * @params reader
   * @params numberOfColumns - of matrix
   * @params numberOfLines - of matrix
   * @return double[][] - array of elements of matrix
   */
  private double[][] inputMatrix(BufferedReader reader, int numberOfColumns, int numberOfLines) throws Exception {
    double[][] array = new double[numberOfLines][numberOfColumns];
    for (int i = 0; i < numberOfLines; i++) {
      for (int j = 0; j < numberOfColumns; j++) {
        boolean repeat = true;
        while (repeat) {
          System.out.println("Input [" + i + "][" + j + "] element");
          String inputString = reader.readLine();
          if (!inputString.matches("^\\d+\\.\\d{2}")) {
            continue;
          } else {
            array[i][j] = Double.parseDouble(inputString);
            repeat = false;
          }
        }
      }
    }
    return array;
  }

  /**
   * Method for input  number of (name of string) and return number
   *
   * @params reader
   * @params string - name of element
   * @return int - number of
   */
  private int inputIntNumberOf(BufferedReader reader, String string) throws Exception {
    System.out.println("Input number of " + string + " (int>0)");
    while (true) {
      String inputString = reader.readLine();
      if (!inputString.matches("^\\d+")) {
        continue;
      }
      int numberOf = Integer.parseInt(inputString);
      if (numberOf > 0) {
        return numberOf;
      }
    }
  }
}
