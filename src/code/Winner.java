package code;

/**
 * Created by timofeiKyksenok on 23.03.2017.
 */
public class Winner {
    private Player winner;
    private boolean haveWinner;

    public boolean checkWinner(Field field, Player player) {
        int[] a = new int[3];
        for (int i = 1; i <= 3; i++) {
            a[0] = field.getCellState(i, 1);
            a[1] = field.getCellState(i, 2);
            a[2] = field.getCellState(i, 3);
            if (a[0] == a[1] & a[1] == a[2] & a[0] != '-') {
                winner = player;
                haveWinner = true;
            }
            a[0] = field.getCellState(1, i);
            a[1] = field.getCellState(2, i);
            a[2] = field.getCellState(3, i);
            if (a[0] == a[1] & a[1] == a[2] & a[0] != '-') {
                winner = player;
                haveWinner = true;
            }
        }
        a[0] = field.getCellState(1, 1);
        a[1] = field.getCellState(2, 2);
        a[2] = field.getCellState(3, 3);
        if (a[0] == a[1] & a[1] == a[2] & a[0] != '-') {
            winner = player;
            haveWinner = true;
        }
        a[0] = field.getCellState(3, 1);
        a[0] = field.getCellState(2, 2);
        a[0] = field.getCellState(1, 3);
        if (a[0] == a[1] & a[1] == a[2] & a[0] != '-') {
            winner = player;
            haveWinner = true;
        }
    return haveWinner;
    }
}