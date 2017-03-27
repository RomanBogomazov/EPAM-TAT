package code;

import javax.swing.JButton;

/**
 * Created by User on 27.03.2017.
 */
class SmartComp {
  private Checker checker = new Checker();
  private SemiWinner semiWinner = new SemiWinner();
  private CompAttack compAttack = new CompAttack();
  private int randomX;
  private int randomY;
  private boolean compHasChance = true;
  private int gridSize;
  private int step;

  void manage(JButton[][] buttons, String defaultSymbol, int step, int x, int y) {
    gridSize = buttons.length;
    this.step = step;
    buttons[x][y].setText("X");
    buttons[x][y].setEnabled(false);
    compHasChance = checker.checkOnWin(buttons, compHasChance);
    if (compHasChance == true) {
      while (true) {
        if (semiWinner.checkSemiWinner(buttons) == true) {
          if (compAttack.checkOnReadyForAttack(buttons) == true) {
            compAttack.getCellForAttack().setText("O");
            compAttack.getCellForAttack().setEnabled(false);
            compHasChance = checker.checkOnWin(buttons, compHasChance);
            break;
          } else {
            if (semiWinner.getSemiWinner().getText().equals(defaultSymbol)) {
              semiWinner.getSemiWinner().setText("O");
              semiWinner.getSemiWinner().setEnabled(false);
              compHasChance = checker.checkOnWin(buttons, compHasChance);
              break;
            }
          }
        }
        if (step >= gridSize*gridSize) {
          checker.checkOnDraw(buttons, step);
          break;
        } else {
          randomX = (int) (Math.random() * gridSize);
          randomY = (int) (Math.random() * gridSize);
          if (buttons[randomX][randomY].getText().equals(defaultSymbol)) {
            buttons[randomX][randomY].setText("O");
            buttons[randomX][randomY].setEnabled(false);
            compHasChance = checker.checkOnWin(buttons, compHasChance);
            break;
          }
          if (step == gridSize*gridSize - 1) {
            checker.checkOnDraw(buttons, step);
            break;
          }
        }
      }
    }
    checker.checkOnDraw(buttons, step);
  }
}