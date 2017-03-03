package Task10;

import java.math.BigDecimal;

/**
 * Class for output
 */
public class Outputter {

  /**
   * Method for output to console elements of BigDecimal matrix
   *
   * @params resoultingMatrix - for output
   */
  public void toDisplay(BigDecimalMatrix resoultingMatrix) {
    System.out.println("Resoulting Matrix: ");
    for (int i = 0; i < resoultingMatrix.getNumberOfLines(); i++) {
      for (int j = 0; j < resoultingMatrix.getNumberOfColumns(); j++) {
        System.out.print(resoultingMatrix.getMatrix()[i][j] + " ");
      }
      System.out.println();
    }
  }
}
