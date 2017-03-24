package code;

/**
 * Created by User on 23.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Player[] players = new Player[2];
            players[0] = new Player('X');
            players[1] = new Player('O');
            Field field = new Field();
            Winner winner = new Winner();
            ControllingInputter inputer = new ControllingInputter();

            field.output();

            for (byte i = 0; i < 9; i++) {
                inputer.input();
                if (i % 2 == 0) {
                    field.set(inputer.getString(), players[0].getPlayerSymbol());
                    if (winner.checkWinner(field, players[0]) == true) {
                        System.out.println("Congratulation 'X'-player!");
                        break;
                    }
                } else {
                    field.set(inputer.getString(), players[1].getPlayerSymbol());
                    if (winner.checkWinner(field, players[1]) == true) {
                        System.out.println("Congratulation 'O'-player!");
                        break;
                    }
                }
                field.output();
            }
            if (winner.checkWinner(field, players[0]) == false) {
                System.out.println("Win friendship!!!");
            }
            } catch (Exception e){
            System.out.println("You have a problem!" + e);
        }
    }
}