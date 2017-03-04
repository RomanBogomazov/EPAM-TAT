/**
 * Class otput matrix.
 */
class Output {

/**
 * Output matrix on line.
 */
  public void get(double[][] mass) {
    for(int i = 0; i < mass.length; i++) {
      System.out.print("Line ¹ " + (i + 1) + ": ");
      for(int j = 0; j < mass[i].length; j++) {
        System.out.print(mass[i][j] + "     ");
        if(j == mass[i].length - 1) System.out.println();
      }
    }
  }
}