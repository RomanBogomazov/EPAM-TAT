package code;

import javax.swing.*;

/**
 * Created by User on 23.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            JFrame frame = null;
            Field field = new Field(frame);

        } catch (Exception e){
            System.out.println("You have a problem!");
            System.out.println(e);
        }
    }
}