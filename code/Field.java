package code;

import javax.swing.*;
import java.awt.*;

/**
 * Created by RomanBogomazov on 23.03.2017.
 * Create field of buttons which using to play in game. In classic TikTakTok 9 buttons.
 */
class Field {
  private Font font = new Font("Times New Roman", Font.BOLD, 96);
  private int gridSize;
  private String defaultSymbol = "-";
  private JButton[][] buttons;
  private int step = 0;
  private SimpleComp simpleComp = new SimpleComp();
  private MediumComp mediumComp = new MediumComp();
  private SmartComp smartComp = new SmartComp();
  private RealPlayer realPlayer = new RealPlayer();

  Field(JFrame frame, String opponent, int intSizeField) {
    gridSize = intSizeField;
    buttons = new JButton[gridSize][gridSize];
    int buttonWidth;
    int buttonHeight;
    for (int i = 0; i < gridSize; i++) {
      for (int j = 0; j < gridSize; j++) {
        buttons[i][j] = new JButton(defaultSymbol);
        buttonWidth = 3*frame.getWidth()/(gridSize*4);
        buttonHeight = 3*frame.getHeight()/(gridSize*4);
        buttons[i][j].setBounds(frame.getWidth()/8 + i*buttonWidth, frame.getHeight()/8 + j*buttonHeight, buttonWidth, buttonHeight);
        buttons[i][j].setFont(font);
        frame.add(buttons[i][j]);

        int x = i, y = j;
        buttons[x][y].addActionListener(e -> {
          if (opponent.equals("SimpleComp")) {
            simpleComp.manage(buttons, defaultSymbol, step, x, y);
            step += 2;
          }

          if (opponent.equals("MediumComp")) {
            mediumComp.manage(buttons, defaultSymbol, step, x, y);
            step += 2;
          }

          if (opponent.equals("SmartComp")) {
            smartComp.manage(buttons, defaultSymbol, step, x, y);
            step += 2;
          }

          if (opponent.equals("Real")) {
            realPlayer.manage(buttons, step, x, y);
            step++;
          }
        });
      }
    }
    setEnabled(true);
  }

  private void setEnabled(boolean set) {
    for (int i = 0; i < gridSize; i++) {
      for (int j = 0; j < gridSize; j++) {
        buttons[i][j].setEnabled(set);
      }
    }
  }

  void setVisible(boolean set) {
    for (int i = 0; i < gridSize; i++) {
      for (int j = 0; j < gridSize; j++) {
        buttons[i][j].setVisible(set);
      }
    }
  }
}