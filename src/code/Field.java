package code;

/**
 * Created by User on 23.03.2017.
 */
public class Field {
    private Cell[][] cells = new Cell[3][3];

    Field() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public void set(String position, char playerSymbol) {
        byte x = Byte.valueOf(String.valueOf(position.charAt(0)));
        byte y = Byte.valueOf(String.valueOf(position.charAt(1)));
        if (cells[x - 1][y - 1].getState() == '-') {
            cells[x - 1][y - 1].setState(playerSymbol, x, y);
        }
    }

    public void output() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cells[i][j].getState());
            }
            System.out.println();
        }
    }

    public char getCellState(int x, int y){
        return cells[x - 1][y - 1].getState();
    }
}
