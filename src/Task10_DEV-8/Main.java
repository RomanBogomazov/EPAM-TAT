package Task10;

/**
 * Main class
 */
public class Main {

  /**
   * Entry point in programm
   * @param args[] not used
   */
  public static void main(String[] args) throws Exception {
    Inputter inputter = new Inputter();
    DoubleMatrix firstMatrix = new DoubleMatrix();
    DoubleMatrix secondMatrix = new DoubleMatrix();
    inputter.input(firstMatrix);
    inputter.input(secondMatrix);
    CheckerMultiplyMatrix checkerMultiplyMatrix = new CheckerMultiplyMatrix();
    if (checkerMultiplyMatrix.check(firstMatrix, secondMatrix)) {
      Multiplicater multiplicater = new Multiplicater();
      BigDecimalMatrix resoultingMatrix = new BigDecimalMatrix();
      multiplicater.multiplyMatrix(firstMatrix, secondMatrix, resoultingMatrix);
      Outputter outputter = new Outputter();
      outputter.toDisplay(resoultingMatrix);
    } else {
      System.out.println("We cannot multiply these matrices.");
    }
  }
}
