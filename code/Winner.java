package code;

import javax.swing.*;

/**
 * Created by RomanBogomazov on 23.03.2017.
 * Check field on consisting of winner.
 */
class Winner {

  private boolean haveWinner = false;
  private JButton[] winner = new JButton[3];

  /**
   * Check field on consisting of winner.
   *
   * @param buttons buttons from field: choosing and not choosing.
   * @return answer on a question: "Game has winner?".
   */
  boolean checkWinner(JButton[][] buttons) {
    String[] a = new String[3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        a[j] = buttons[i][j].getText();
      }
      if (a[0] == a[1] & a[1] == a[2] & a[0] != "-") {    //check horizontal line.
        winner = buttons[i];
        haveWinner = true;
      }

      for (int j = 0; j < 3; j++) {
        a[j] = buttons[j][i].getText();
      }
      if (a[0] == a[1] & a[1] == a[2] & a[0] != "-") {    //check vertical line.
        for (int j = 0; j < 3; j++) {
          winner[j] = buttons[j][i];
        }
        haveWinner = true;
      }
    }

    for (int j = 0; j < 3; j++) {
      a[j] = buttons[j][j].getText();
    }
    if (a[0] == a[1] & a[1] == a[2] & a[0] != "-") {    //check diagonal from up-left corner line.
      for (int j = 0; j < 3; j++) {
        winner[j] = buttons[j][j];
      }
      haveWinner = true;
    }
    a[0] = buttons[2][0].getText();
    a[1] = buttons[1][1].getText();
    a[2] = buttons[0][2].getText();
    if (a[0] == a[1] & a[1] == a[2] & a[0] != "-") {    //check diagonal from down-left corner line.
      winner[2] = buttons[2][0];
      winner[1] = buttons[1][1];
      winner[0] = buttons[0][2];
      haveWinner = true;
    }
    return haveWinner;
  }

  /**
   * @return winner combination of 3 buttons.
   */
  JButton[] getWinner() {
    return winner;
  }
}