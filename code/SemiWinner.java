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
  private String[] cashArray;
  private int countOfWinnerCombination = 3;
  private int gridSize;

  boolean checkSemiWinner(JButton[][] buttons) {
    gridSize = buttons.length;
    cashArray = new String[countOfWinnerCombination];
    checkVerticalLine(buttons);
    checkHorizontalLine(buttons);
    checkDiagonalFromLeftUpCorner(buttons);
    checkDiagonalFromLeftDownCorner(buttons);

    return haveSemiWinner;
  }

  JButton getSemiWinner() {
    return semiWinner;
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

          if (cashArray[0] == cashArray[1] & cashArray[0] != "-" & cashArray[2] != "O") {
            semiWinner = buttons[i][2+k2];
            haveSemiWinner = true;
          }

          if (cashArray[0] == cashArray[2] & cashArray[0] != "-" & cashArray[1] != "O") {
            semiWinner = buttons[i][1+k2];
            haveSemiWinner = true;
          }

          if (cashArray[1] == cashArray[2] & cashArray[1] != "-" & cashArray[0] != "O") {
            semiWinner = buttons[i][k2];
            haveSemiWinner = true;
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

          if (cashArray[0] == cashArray[1] & cashArray[0] != "-" & cashArray[2] != "O") {
            semiWinner = buttons[2+k2][i];
            haveSemiWinner = true;
          }

          if (cashArray[0] == cashArray[2] & cashArray[0] != "-" & cashArray[1] != "O") {
            semiWinner = buttons[1+k2][i];
            haveSemiWinner = true;
          }

          if (cashArray[1] == cashArray[2] & cashArray[1] != "-" & cashArray[0] != "O") {
            semiWinner = buttons[k2][i];
            haveSemiWinner = true;
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

          if (cashArray[0] == cashArray[1] & cashArray[0] != "-" & cashArray[2] != "O") {
            semiWinner = buttons[2+k1][2+k2];
            haveSemiWinner = true;
          }

          if (cashArray[0] == cashArray[2] & cashArray[0] != "-" & cashArray[1] != "O") {
            semiWinner = buttons[1+k1][1+k2];
            haveSemiWinner = true;
          }

          if (cashArray[1] == cashArray[2] & cashArray[1] != "-" & cashArray[0] != "O") {
            semiWinner = buttons[k1][k2];
            haveSemiWinner = true;
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

          if (cashArray[0] == cashArray[1] & cashArray[0] != "-" & cashArray[2] != "O") {
            semiWinner = buttons[k1][2+k2];
            haveSemiWinner = true;
          }

          if (cashArray[0] == cashArray[2] & cashArray[0] != "-" & cashArray[1] != "O") {
            semiWinner = buttons[1+k1][1+k2];
            haveSemiWinner = true;
          }

          if (cashArray[1] == cashArray[2] & cashArray[1] != "-" & cashArray[0] != "O") {
            semiWinner = buttons[2+k1][k2];
            haveSemiWinner = true;
          }
        }
      }
    }
  }
}