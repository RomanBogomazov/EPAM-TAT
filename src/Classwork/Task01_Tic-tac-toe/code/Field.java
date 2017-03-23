package code;

/**
 * Created by User on 23.03.2017.
 */
public class Field {

  private char[][] cells = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
  private byte numberOfStep = 0;

  public void set(String position, char playerSymbol) {
    int x = Integer.valueOf(position.charAt(0));
    int y = Integer.valueOf(position.charAt(1));
    cells[x][y] = playerSymbol;
  }

  public char[][] getCells() {
    return cells;
  }

  public void output() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; i < 3; j++) {
        System.out.print(cells[i][j]);
      }
      System.out.println();
    }
  }
}
