package code;

import java.awt.Color;
import javax.swing.JButton;

/**
 * Created by User on 27.03.2017.
 */
class RealPlayer {
  private Winner winner = new Winner();
  private int gridSize;
  private int step;

  void manage(JButton[][] buttons, int step, int x, int y) {
    gridSize = buttons.length;
    this.step = step;
    if (step % 2 == 0) {
      buttons[x][y].setText("X");
      buttons[x][y].setEnabled(false);
    } else {
      buttons[x][y].setText("O");
      buttons[x][y].setEnabled(false);
    }
    checkOnWin(buttons);
    checkOnDraw(buttons);
  }

  private void checkOnWin(JButton[][] buttons) {
    if (winner.checkWinner(buttons) == true) {
      for (int i = 0; i < gridSize; i++) {
        for (int j = 0; j < gridSize; j++) {
          buttons[i][j].setEnabled(false);
        }
        winner.getWinner()[i].setBackground(new Color(255, 0, 0));
      }
            /*winner.getWinner()[0].setText("WI");
            winner.getWinner()[1].setText("NN");
            winner.getWinner()[2].setText("ER");*/
    }
  }

  private void checkOnDraw(JButton[][] buttons) {
    if (winner.checkWinner(buttons) == false & step == gridSize*gridSize - 1) {
      for (int i = 0; i < gridSize; i++) {
        for (int j = 0; j < gridSize; j++) {
          buttons[i][j].setBackground(new Color(0, 255, 0));
        }
      }
    }
  }
}