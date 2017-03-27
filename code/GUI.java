package code;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Created by User on 27.03.2017.
 */
class GUI {
  private static Font font = new Font("Times New Roman", Font.BOLD, 36);
  private static Field field;
  private Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
  private int sizeX = (int) size.getWidth();
  private int sizeY = (int) size.getHeight();
  private JButton[] mode = new JButton[4];
  private String[] nameOfMode = {"SimpleComp", "MediumComp", "SmartComp", "Real"};

  GUI(){
    JFrame frame = new JFrame();
    frame.setUndecorated(true);
    frame.setBounds(sizeX/4, sizeY/4, sizeX/2, sizeY/2);
    frame.setLayout(null);
    frame.setVisible(true);

    JButton close = new JButton("X");   //Close frame.
    close.setBounds(sizeX/2 - sizeX/16, 0, sizeX/16, sizeY/16);
    close.setFont(font);
    frame.add(close);

    JButton back = new JButton("Back on main menu");      //Live with field of cells to return on main menu.
    back.setVisible(false);
    back.setBounds(sizeX/8, sizeY/2 - sizeY/16, sizeX/4, sizeY/16);
    back.setFont(font);
    frame.add(back);

    for (int i=0; i<mode.length; i++) {
      String[] nameLabelOfMode = {"Simple computer", "Medium computer", "Smart computer", "PvP"};
      mode[i] = new JButton(nameLabelOfMode[i]);
      mode[i].setBounds(sizeX/8, sizeY/8 + i*sizeY/16, sizeX/4, sizeY/16);
      mode[i].setFont(font);
      frame.add(mode[i]);

      int finalI = i;
      mode[i].addActionListener(e -> {
        setModeVisible(false);
        field = new Field(frame, nameOfMode[finalI]);
        field.setVisible(false);
        field.setVisible(true);
        back.setVisible(true);
      });
    }

    close.addActionListener(e -> frame.dispose());

    back.addActionListener(e -> {
      setModeVisible(true);
      field.setVisible(false);
      back.setVisible(false);
    });
  }

  private void setModeVisible(boolean set) {
    for (JButton aMode : mode) {
      aMode.setVisible(set);
    }
  }
}