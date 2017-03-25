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
    private int randomX;
    private int randomY;

    Field(JFrame frame, String oponent) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("-");
                buttons[i][j].setBounds(i * 200, j * 200, 200,200);
                buttons[i][j].setFont(font);
                frame.add(buttons[i][j]);

                int x = i, y = j;
                buttons[x][y].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (oponent.equals("Comp")) {
                            buttons[x][y].setText("X");
                            buttons[x][y].setEnabled(false);
                            if (winner.checkWinner(buttons) == true) {
                                for (int i = 0; i < 3; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        buttons[i][j].setEnabled(false);
                                    }
                                    winner.getWinner()[i].setBackground(new Color(255,0,0));
                                }
                                    /*winner.getWinner()[0].setText("WI");
                                    winner.getWinner()[1].setText("NN");
                                    winner.getWinner()[2].setText("ER");*/
                            }
                            while(true){
                                randomX = (int) (Math.random() * 3);
                                randomY = (int) (Math.random() * 3);
                                if (buttons[randomX][randomY].getText().equals("-")){
                                    buttons[randomX][randomY].setText("O");
                                    buttons[randomX][randomY].setEnabled(false);
                                    if (winner.checkWinner(buttons) == true) {
                                        for (int i = 0; i < 3; i++) {
                                            for (int j = 0; j < 3; j++) {
                                                buttons[i][j].setEnabled(false);
                                            }
                                            winner.getWinner()[i].setBackground(new Color(255,0,0));
                                        }
                                    /*winner.getWinner()[0].setText("WI");
                                    winner.getWinner()[1].setText("NN");
                                    winner.getWinner()[2].setText("ER");*/
                                    }
                                    break;
                                }
                                if (step == MaxStep - 1) {
                                    if (winner.checkWinner(buttons) == false) {
                                        for (int i = 0; i < 3; i++) {
                                            for (int j = 0; j < 3; j++) {
                                                buttons[i][j].setBackground(new Color(0,255,0));
                                            }
                                        }
                                    }
                                    break;
                                }
                            }
                            step += 2;
                        }

                        if (oponent.equals("Real")) {
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
                            /*winner.getWinner()[0].setText("WI");
                            winner.getWinner()[1].setText("NN");
                            winner.getWinner()[2].setText("ER");*/
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
                    }
                });
            }
        }
        setEnabled(true);
    }

    public void setEnabled(boolean set) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(set);
            }
        }
    }

    public void setVisible(boolean set) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setVisible(set);
            }
        }
    }
}