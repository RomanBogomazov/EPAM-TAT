package code;

import javax.swing.*;

/**
 * Created by User on 26.03.2017.
 */
public class CompAttack {

  private boolean haveAttack = false;
  private JButton cellForAttack = new JButton();

  public boolean checkOnReadyForAttack(JButton[][] buttons) {
    String[] a = new String[3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        a[j] = buttons[i][j].getText();
      }
      if (a[0] == a[1] & a[0] == "O" & a[2] == "-") {
        cellForAttack = buttons[i][2];
        haveAttack = true;
      }

      if (a[0] == a[2] & a[0] == "O" & a[1] == "-") {
        cellForAttack = buttons[i][1];
        haveAttack = true;
      }

      if (a[1] == a[2] & a[1] == "O" & a[0] == "-") {
        cellForAttack = buttons[i][0];
        haveAttack = true;
      }

      for (int j = 0; j < 3; j++) {
        a[j] = buttons[j][i].getText();
      }
      if (a[0] == a[1] & a[0] == "O" & a[2] == "-") {
        cellForAttack = buttons[2][i];
        haveAttack = true;
      }

      if (a[0] == a[2] & a[0] == "O" & a[1] == "-") {
        cellForAttack = buttons[1][i];
        haveAttack = true;
      }

      if (a[1] == a[2] & a[1] == "O" & a[0] == "-") {
        cellForAttack = buttons[0][i];
        haveAttack = true;
      }
    }

    for (int j = 0; j < 3; j++) {
      a[j] = buttons[j][j].getText();
    }
    if (a[0] == a[1] & a[0] == "O" & a[2] == "-") {
      cellForAttack = buttons[2][2];
      haveAttack = true;
    }

    if (a[0] == a[2] & a[0] == "O" & a[1] == "-") {
      cellForAttack = buttons[1][1];
      haveAttack = true;
    }

    if (a[1] == a[2] & a[1] == "O" & a[0] == "-") {
      cellForAttack = buttons[0][0];
      haveAttack = true;
    }

    a[0] = buttons[2][0].getText();
    a[1] = buttons[1][1].getText();
    a[2] = buttons[0][2].getText();
    if (a[0] == a[1] & a[0] == "O" & a[2] == "-") {
      cellForAttack = buttons[0][2];
      haveAttack = true;
    }

    if (a[0] == a[2] & a[0] == "O" & a[1] == "-") {
      cellForAttack = buttons[1][1];
      haveAttack = true;
    }

    if (a[1] == a[2] & a[1] == "O" & a[0] == "-") {
      cellForAttack = buttons[2][0];
      haveAttack = true;
    }
    return haveAttack;
  }

  public JButton getCellForAttack() {
    return cellForAttack;
  }
}