package code;

import javax.swing.*;
import java.awt.*;

/**
 * Created by RomanBogomazov on 23.03.2017.
 * Create field of buttons which using to play in game. In classic TikTakTok 9 buttons.
 */
class Field {
  private Font font = new Font("Times New Roman", Font.BOLD, 96);
  private int gridSize = 3;
  private String defaultSymbol = "-";
  private JButton[][] buttons = new JButton[gridSize][gridSize];
  private int step = 0;
  private SimpleComp simpleComp = new SimpleComp();
  private MediumComp mediumComp = new MediumComp();
  private SmartComp smartComp = new SmartComp();
  private RealPlayer realPlayer = new RealPlayer();

  Field(JFrame frame, String opponent) {
    for (int i = 0; i < gridSize; i++) {
      for (int j = 0; j < gridSize; j++) {
        buttons[i][j] = new JButton(defaultSymbol);
        buttons[i][j].setBounds(frame.getWidth()/8 + i*frame.getWidth()/4, frame.getHeight()/8 + j*frame.getHeight()/4, frame.getWidth()/4, frame.getHeight()/4);
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