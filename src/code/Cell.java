package code;

/**
 * Created by User on 23.03.2017.
 */
public class Cell {
    private char state = '-';
    private byte x;
    private byte y;

    public char getState() {
        return state;
    }

    public void setState(char playerState, byte x, byte y) {
        state = playerState;
        this.x = x;
        this.y = y;
    }
}
