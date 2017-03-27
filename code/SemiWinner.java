package code;

import javax.swing.*;

/**
 * Created by RomanBogomazov on 26.03.2017.
 * Search on field combinations, which can do win.
 * For example: cells "10" and "11" have semiwinner - "12".
 * For example: cells "00" and "11" have semiwinner - "22".
 */
class SemiWinner {

  private boolean haveSemiWinner = false;
  private JButton semiWinner = new JButton();

  boolean checkSemiWinner(JButton[][] buttons) {
    String[] a = new String[3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        a[j] = buttons[i][j].getText();
      }
      if (a[0] == a[1] & a[0] != "-" & (a[2] != "O" | a[2] != "X")) {
        semiWinner = buttons[i][2];
        haveSemiWinner = true;
      }

      if (a[0] == a[2] & a[0] != "-" & (a[1] != "O" | a[1] != "X")) {
        semiWinner = buttons[i][1];
        haveSemiWinner = true;
      }

      if (a[1] == a[2] & a[1] != "-" & (a[0] != "O" | a[0] != "X")) {
        semiWinner = buttons[i][0];
        haveSemiWinner = true;
      }

      for (int j = 0; j < 3; j++) {
        a[j] = buttons[j][i].getText();
      }
      if (a[0] == a[1] & a[0] != "-" & (a[2] != "O" | a[2] != "X")) {
        semiWinner = buttons[2][i];
        haveSemiWinner = true;
      }

      if (a[0] == a[2] & a[0] != "-" & (a[1] != "O" | a[1] != "X")) {
        semiWinner = buttons[1][i];
        haveSemiWinner = true;
      }

      if (a[1] == a[2] & a[1] != "-" & (a[0] != "O" | a[0] != "X")) {
        semiWinner = buttons[0][i];
        haveSemiWinner = true;
      }
    }

    for (int j = 0; j < 3; j++) {
      a[j] = buttons[j][j].getText();
    }
    if (a[0] == a[1] & a[0] != "-" & (a[2] != "O" | a[2] != "X")) {
      semiWinner = buttons[2][2];
      haveSemiWinner = true;
    }

    if (a[0] == a[2] & a[0] != "-" & (a[1] != "O" | a[1] != "X")) {
      semiWinner = buttons[1][1];
      haveSemiWinner = true;
    }

    if (a[1] == a[2] & a[1] != "-" & (a[0] != "O" | a[0] != "X")) {
      semiWinner = buttons[0][0];
      haveSemiWinner = true;
    }

    a[0] = buttons[2][0].getText();
    a[1] = buttons[1][1].getText();
    a[2] = buttons[0][2].getText();
    if (a[0] == a[1] & a[0] != "-" & (a[2] != "O" | a[2] != "X")) {
      semiWinner = buttons[0][2];
      haveSemiWinner = true;
    }

    if (a[0] == a[2] & a[0] != "-" & (a[1] != "O" | a[1] != "X")) {
      semiWinner = buttons[1][1];
      haveSemiWinner = true;
    }

    if (a[1] == a[2] & a[1] != "-" & (a[0] != "O" | a[0] != "X")) {
      semiWinner = buttons[2][0];
      haveSemiWinner = true;
    }
    return haveSemiWinner;
  }

  JButton getSemiWinner() {
    return semiWinner;
  }
}