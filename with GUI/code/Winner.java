package code;

import javax.swing.*;

/**
 * Created by timofeiKyksenok on 23.03.2017.
 */
public class Winner {
    private boolean haveWinner = false;
    private JButton[] winner = new JButton[3];

    public boolean checkWinner(JButton[][] buttons) {
        String[] a = new String[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[j] = buttons[i][j].getText();
            }
            if (a[0] == a[1] & a[1] == a[2] & a[0] != "-") {
                winner = buttons[i];
                haveWinner = true;
            }

            for (int j = 0; j < 3; j++) {
                a[j] = buttons[j][i].getText();
            }
            if (a[0] == a[1] & a[1] == a[2] & a[0] != "-") {
                for (int j = 0; j < 3; j++) {
                    winner[j] = buttons[j][i];
                }
                haveWinner = true;
            }
        }

        for (int j = 0; j < 3; j++) {
            a[j] = buttons[j][j].getText();
        }
        if (a[0] == a[1] & a[1] == a[2] & a[0] != "-") {
            for (int j = 0; j < 3; j++) {
                winner[j] = buttons[j][j];
            }
            haveWinner = true;
        }
        a[0] = buttons[2][0].getText();
        a[1] = buttons[1][1].getText();
        a[2] = buttons[0][2].getText();
        if (a[0] == a[1] & a[1] == a[2] & a[0] != "-") {
            winner[0] = buttons[2][0];
            winner[1] = buttons[1][1];
            winner[2] = buttons[0][2];
            haveWinner = true;
        }
    return haveWinner;
    }

    public JButton[] getWinner() {
        return winner;
    }
}