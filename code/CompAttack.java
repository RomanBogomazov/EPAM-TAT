package code;

import javax.swing.*;

/**
 * Created by User on 26.03.2017.
 */
public class CompAttack {
  private String[] cashArray;
  private int countOfWinnerCombination = 3;
  private int gridSize;
  private boolean haveAttack = false;
  private JButton cellForAttack = new JButton();

  public boolean checkOnReadyForAttack(JButton[][] buttons) {
    gridSize = buttons.length;
    cashArray = new String[countOfWinnerCombination];
    checkVerticalLine(buttons);
    checkHorizontalLine(buttons);
    checkDiagonalFromLeftDownCorner(buttons);
    checkDiagonalFromLeftUpCorner(buttons);

    return haveAttack;
  }

  JButton getCellForAttack() {
    return cellForAttack;
  }


  private void checkVerticalLine(JButton[][] buttons) {
    gridSize = buttons.length;
    for (int k1=0; k1<gridSize-2; k1++) {
      //movement search square on horizontal line
      for (int k2=0; k2<gridSize-2; k2++) {
        //movement search square on vertical line

        for (int i=k1; i<countOfWinnerCombination+k1; i++) {    //vertical searching

          for (int j=0; j<countOfWinnerCombination; j++) {
            cashArray[j] = buttons[i][j+k2].getText();
          }

          if (cashArray[0] == cashArray[1] & cashArray[0] == "O" & cashArray[2] == "-") {
            cellForAttack = buttons[i][2+k2];
            haveAttack = true;
          }

          if (cashArray[0] == cashArray[2] & cashArray[0] == "O" & cashArray[1] == "-") {
            cellForAttack = buttons[i][1+k2];
            haveAttack = true;
          }

          if (cashArray[1] == cashArray[2] & cashArray[1] == "O" & cashArray[0] == "-") {
            cellForAttack = buttons[i][k2];
            haveAttack = true;
          }
        }
      }
    }
  }

  private void checkHorizontalLine(JButton[][] buttons) {
    gridSize = buttons.length;
    for (int k1=0; k1<gridSize-2; k1++) {
      //movement search square on horizontal line
      for (int k2=0; k2<gridSize-2; k2++) {
        //movement search square on vertical line

        for (int i=k1; i<countOfWinnerCombination+k1; i++) {    //vertical searching

          for (int j=0; j<countOfWinnerCombination; j++) {
            cashArray[j] = buttons[j+k2][i].getText();
          }

          if (cashArray[0] == cashArray[1] & cashArray[0] == "O" & cashArray[2] == "-") {
            cellForAttack = buttons[2+k2][i];
            haveAttack = true;
          }

          if (cashArray[0] == cashArray[2] & cashArray[0] == "O" & cashArray[1] == "-") {
            cellForAttack = buttons[1+k2][i];
            haveAttack = true;
          }

          if (cashArray[1] == cashArray[2] & cashArray[1] == "O" & cashArray[0] == "-") {
            cellForAttack = buttons[k2][i];
            haveAttack = true;
          }
        }
      }
    }
  }

  private void checkDiagonalFromLeftUpCorner(JButton[][] buttons) {
    gridSize = buttons.length;
    for (int k1=0; k1<gridSize-2; k1++) {
      //movement search square on horizontal line
      for (int k2=0; k2<gridSize-2; k2++) {
        //movement search square on vertical line

        for (int i=k1; i<countOfWinnerCombination+k1; i++) {    //vertical searching

          for (int j=0; j<countOfWinnerCombination; j++) {
            cashArray[j] = buttons[j+k1][j+k2].getText();
          }

          if (cashArray[0] == cashArray[1] & cashArray[0] == "O" & cashArray[2] == "-") {
            cellForAttack = buttons[2+k1][2+k2];
            haveAttack = true;
          }

          if (cashArray[0] == cashArray[2] & cashArray[0] == "O" & cashArray[1] == "-") {
            cellForAttack = buttons[1+k1][1+k2];
            haveAttack = true;
          }

          if (cashArray[1] == cashArray[2] & cashArray[1] == "O" & cashArray[0] == "-") {
            cellForAttack = buttons[k1][k2];
            haveAttack = true;
          }
        }
      }
    }
  }

  private void checkDiagonalFromLeftDownCorner(JButton[][] buttons) {
    gridSize = buttons.length;
    for (int k1=0; k1<gridSize-2; k1++) {
      //movement search square on horizontal line
      for (int k2=0; k2<gridSize-2; k2++) {
        //movement search square on vertical line

        for (int i=k1; i<countOfWinnerCombination+k1; i++) {    //vertical searching
          cashArray[0] = buttons[2+k1][k2].getText();
          cashArray[1] = buttons[1+k1][1+k2].getText();
          cashArray[2] = buttons[k1][2+k2].getText();

          if (cashArray[0] == cashArray[1] & cashArray[0] == "O" & cashArray[2] == "-") {
            cellForAttack = buttons[k1][2+k2];
            haveAttack = true;
          }

          if (cashArray[0] == cashArray[2] & cashArray[0] == "O" & cashArray[1] == "-") {
            cellForAttack = buttons[1+k1][1+k2];
            haveAttack = true;
          }

          if (cashArray[1] == cashArray[2] & cashArray[1] == "O" & cashArray[0] == "-") {
            cellForAttack = buttons[2+k1][k2];
            haveAttack = true;
          }
        }
      }
    }
  }
}