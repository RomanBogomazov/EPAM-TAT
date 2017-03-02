package Task10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Class Inputter
 */
public class Inputter {

  /**
   * Method for input  number of columns of matrix, numbers of lines of matrix, elements of matrix
   * params Matrix @matrix
   */
  public void input(Matrix matrix) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input matrix");
    int numberOfColumns = inputIntNumberOf(reader, "Columns");
    int numberOfLines = inputIntNumberOf(reader, "Lines");
    double inputtingMatrix[][] = inputMatrix(reader, numberOfColumns, numberOfLines);
    matrix.setMatrix(inputtingMatrix, numberOfColumns, numberOfLines);
  }

  /**
   * Method for input  elements of matrix
   * params BufferedReader @reader
   * params int @numberOfColumns of matrix
   * params int @numberOfLines of matrix
   * return double[][] @massiv of elements of matrix
   */
  private double[][] inputMatrix(BufferedReader reader, int numberOfColumns, int numberOfLines)
      throws Exception {
    double[][] massiv = new double[numberOfLines][numberOfColumns];
    for (int i = 0; i < numberOfLines; i++) {
      for (int j = 0; j < numberOfColumns; j++) {
        boolean repeat = true;
        while (repeat) {
          System.out.println("Input [" + i + "][" + j + "] element");
          String inputString = reader.readLine();
          if (!inputString.matches("^\\d+\\.\\d{2}")) {
            continue;
          } else {
            massiv[i][j] = Double.parseDouble(inputString);
            repeat = false;
          }
        }
      }
    }
    return massiv;
  }

  /**
   * Method for input  number of (name of string) and return number
   * params BufferedReader @reader
   * params String @string - name of element
   * return int numberOf
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
