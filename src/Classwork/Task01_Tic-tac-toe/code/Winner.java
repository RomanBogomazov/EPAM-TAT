package code;

/**
 * Created by timofeiKyksenok on 23.03.2017.
 */
public class Winner {

  private char symbolOfWinner;
  private boolean haveWinner = false;

  public void checkWinner(Field field) {
    this.checkCollumns(field);
    this.checkDiagonals(field);
    this.checkStrings(field);
  }

  private void checkStrings(Field field) {
    char[][] cells = field.getCells();
    for (int i = 0; i < 3; i++) {
      if (cells[0][i] == cells[1][i] && cells[0][i] == cells[2][i] && cells[1][i] != '-') {
        haveWinner = true;
        symbolOfWinner = cells[1][i];
      }
    }
  }

  private void checkCollumns(Field field) {
    char[][] cells = field.getCells();
    for (int i = 0; i < 3; i++) {
      if (cells[i][0] == cells[i][1] && cells[i][0] == cells[i][2] && cells[i][1] != '-') {
        haveWinner = true;
        symbolOfWinner = cells[i][1];
      }
    }
  }

  private void checkDiagonals(Field field) {
    char[][] cells = field.getCells();
    if (cells[0][0] == cells[1][1] && cells[0][0] == cells[2][2] && cells[0][0] != '-') {
      haveWinner = true;
      symbolOfWinner = cells[1][1];
    }
    if (cells[2][0] == cells[1][1] && cells[1][1] == cells[2][0] && cells[1][1] != '-') {
      haveWinner = true;
      symbolOfWinner = cells[1][1];
    }
  }
}
