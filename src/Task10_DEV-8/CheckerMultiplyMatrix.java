package Task10;

/**
 * Created by main on 02.03.2017.
 */
public class CheckerMultiplyMatrix {

  public boolean check(DoubleMatrix firstMatrix, DoubleMatrix secondMatrix) {
    if(firstMatrix.getNumberOfColumns()==secondMatrix.getNumberOfLines()) {
      return true;
    } else {
      return false;
    }
  }
}
