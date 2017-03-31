package code;

import javax.swing.*;

/**
 * Created by RomanBogomazov on 23.03.2017.
 * Check field on consisting of winner.
 */
class Winner {
  private boolean haveWinner = false;
  private int gridSize;
  private int countOfWinnerCombination = 3;
  private JButton[] winner;
  private String[] cashArray;

  /**
   * Check field on consisting of winner.
   * @param buttons buttons from field: choosing and not choosing.
   * @return answer on a question: "Game has winner?".
   */
  boolean checkWinner(JButton[][] buttons) {
    gridSize = buttons.length;
    cashArray = new String[countOfWinnerCombination];
    winner = new JButton[countOfWinnerCombination];
    checkVerticalLine(buttons);
    checkHorizontalLine(buttons);
    checkDiagonalFromLeftUpCorner(buttons);
    checkDiagonalFromLeftDownCorner(buttons);

    return haveWinner;
  }

  /**
   * @return winner combination of 3 buttons.
   */
  JButton[] getWinner() {
    return winner;
  }

  void checkVerticalLine(JButton[][] buttons) {
    for (int k1=0; k1<gridSize-2; k1++) {
      //movement search square on horizontal line
      for (int k2=0; k2<gridSize-2; k2++) {
        //movement search square on vertical line

        for (int i=k1; i<countOfWinnerCombination+k1; i++) {    //vertical searching

          for (int j=0; j<countOfWinnerCombination; j++) {
            cashArray[j] = buttons[i][j + k2].getText();
          }

          if (cashArray[0] == cashArray[1] & cashArray[1] == cashArray[2] & cashArray[0] != "-") {
            for (int j=0; j<countOfWinnerCombination; j++) {
              winner[j] = buttons[i][j + k2];
            }
            haveWinner = true;
          }
        }
      }
    }
  }

  void checkHorizontalLine(JButton[][] buttons) {
    for (int k1=0; k1<gridSize-2; k1++) {
      //movement search square on horizontal line
      for (int k2 = 0; k2<gridSize - 2; k2++) {
        //movement search square on vertical line

        for (int i = k1; i < countOfWinnerCombination + k1; i++) {    //vertical searching

          for (int j = 0; j < countOfWinnerCombination; j++) {
            cashArray[j] = buttons[j + k2][i].getText();
          }

          if (cashArray[0] == cashArray[1] & cashArray[1] == cashArray[2] & cashArray[0] != "-") {
            for (int j = 0; j < countOfWinnerCombination; j++) {
              winner[j] = buttons[j + k2][i];
            }
            haveWinner = true;
          }
        }
      }
    }
  }

  void checkDiagonalFromLeftUpCorner(JButton[][] buttons) {
    for (int k1=0; k1<gridSize-2; k1++) {
      //movement search square on horizontal line
      for (int k2 = 0; k2<gridSize - 2; k2++) {
        //movement search square on vertical line

        for (int i = k1; i < countOfWinnerCombination + k1; i++) {    //vertical searching

          for (int j = 0; j < countOfWinnerCombination; j++) {
            cashArray[j] = buttons[j + k1][j + k2].getText();
          }

          if (cashArray[0] == cashArray[1] & cashArray[1] == cashArray[2] & cashArray[0] != "-") {    //check diagonal from up-left corner line.
            for (int j = 0; j < countOfWinnerCombination; j++) {
              winner[j] = buttons[j + k1][j + k2];
            }
            haveWinner = true;
          }

        }

      }
    }
  }

  void checkDiagonalFromLeftDownCorner(JButton[][] buttons) {
    for (int k1=0; k1<gridSize-2; k1++) {
      //movement search square on horizontal line
      for (int k2 = 0; k2<gridSize - 2; k2++) {
        //movement search square on vertical line

        for (int i = k1; i < countOfWinnerCombination + k1; i++) {    //vertical searching

          cashArray[0] = buttons[2+k1][0+k2].getText();
          cashArray[1] = buttons[1+k1][1+k2].getText();
          cashArray[2] = buttons[0+k1][2+k2].getText();

          if (cashArray[0] == cashArray[1] & cashArray[1] == cashArray[2] & cashArray[0] != "-") {    //check diagonal from up-left corner line.
            winner[2] = buttons[2+k1][0+k2];
            winner[1] = buttons[1+k1][1+k2];
            winner[0] = buttons[0+k1][2+k2];
            haveWinner = true;
          }

        }
      }
    }
  }
}