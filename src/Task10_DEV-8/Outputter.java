package Task10;

import java.math.BigDecimal;

/**
 * Created by main on 02.03.2017.
 */
public class Outputter {

  public void toDisplay(BigDecimalMatrix resoultingMatrix) {
    System.out.println("Resoulting Matrix: ");
    for(int i = 0; i < resoultingMatrix.getNumberOfLines(); i++) {
      for(int j = 0; j < resoultingMatrix.getNumberOfColumns(); j++) {
        System.out.print(resoultingMatrix.getMatrix()[i][j] + " ");
      }
      System.out.println();
    }
  }
}
