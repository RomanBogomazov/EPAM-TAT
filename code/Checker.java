package code;

import java.awt.Color;
import javax.swing.JButton;

/**
 * Created by User on 27.03.2017.
 */
public class Checker {
  private Winner winner = new Winner();
  private int countOfWinnerCombination = 3;
  private Color winColor = new Color(255,0,0);
  private Color drawColor = new Color(0,255,0);

  boolean checkOnWin(JButton[][] buttons, boolean compHasChance) {
    if (winner.checkWinner(buttons) == true) {
      for (int i = 0; i < buttons.length; i++) {
        for (int j = 0; j < buttons.length; j++) {
          buttons[i][j].setEnabled(false);
        }
      }
      for (int i = 0; i < countOfWinnerCombination; i++) {
        winner.getWinner()[i].setBackground(winColor);
      }
      compHasChance = false;
            /*winner.getWinner()[0].setText("WI");
            winner.getWinner()[1].setText("NN");
            winner.getWinner()[2].setText("ER");*/
    }
    return compHasChance;
  }

  void checkOnDraw(JButton[][] buttons, int step) {
    if (winner.checkWinner(buttons) == false & step == buttons.length*buttons.length - 1) {
      for (int i = 0; i < buttons.length; i++) {
        for (int j = 0; j < buttons.length; j++) {
          buttons[i][j].setBackground(drawColor);
        }
      }
    }
  }
}