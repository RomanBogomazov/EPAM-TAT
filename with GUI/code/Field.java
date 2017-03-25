package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 23.03.2017.
 */
public class Field {
    private Font font = new Font("Times New Roman", Font.BOLD| Font.CENTER_BASELINE, 96);
    private JButton[][] buttons = new JButton[3][3];
    private int step = 0;
    private int MaxStep = 9;
    private Winner winner = new Winner();

    Field(JFrame frame) {
        frame = new JFrame();
        frame.setBounds(50, 50, 635, 690);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setFont(font);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("-");
                buttons[i][j].setBounds(i * 200, j * 200, 200,200);
                buttons[i][j].setVisible(true);
                buttons[i][j].setFont(font);
                frame.add(buttons[i][j]);

                int x = i, y = j;
                buttons[x][y].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (step % 2 == 0) {
                            buttons[x][y].setText("X");
                            buttons[x][y].setEnabled(false);
                        }
                        else {
                            buttons[x][y].setText("O");
                            buttons[x][y].setEnabled(false);
                        }
                        if (winner.checkWinner(buttons) == true) {
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    buttons[i][j].setEnabled(false);
                                }
                                winner.getWinner()[i].setBackground(new Color(255,0,0));
                            }
                        }
                        step++;
                        if (winner.checkWinner(buttons) == false & step == MaxStep) {
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    buttons[i][j].setBackground(new Color(0,255,0));
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public String getCellState(int x, int y){
        return buttons[x - 1][y - 1].getText();
    }

    public void setEnabled(boolean set) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(set);
            }
        }
    }
}