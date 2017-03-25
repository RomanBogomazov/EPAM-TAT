package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 23.03.2017.
 */
public class Main {
    private static Font font = new Font("Times New Roman", Font.BOLD| Font.CENTER_BASELINE, 36);
    private static Field field;

    public static void main(String[] args) {
        try {
            JFrame frame = new JFrame();
            frame.setUndecorated(true);
            frame.setBounds(50, 50, 600, 800);
            frame.setLayout(null);
            frame.setVisible(true);

            JButton comp = new JButton("Play with computer");
            comp.setBounds(100, 200, 400,200);
            comp.setFont(font);
            frame.add(comp);

            JButton real = new JButton("Play with player");
            real.setBounds(100, 400, 400,200);
            real.setFont(font);
            frame.add(real);

            JButton back = new JButton("Back on main menu");
            back.setVisible(false);
            back.setBounds(0, 600, 600,200);
            back.setFont(font);
            frame.add(back);

            comp.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    comp.setVisible(false);
                    real.setVisible(false);
                    field = new Field(frame, "Comp");
                    field.setVisible(true);
                    back.setVisible(true);
                }
            });

            real.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    comp.setVisible(false);
                    real.setVisible(false);
                    field = new Field(frame, "Real");
                    field.setVisible(true);
                    back.setVisible(true);
                }
            });

            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    comp.setVisible(true);
                    real.setVisible(true);
                    field.setVisible(false);
                    back.setVisible(false);
                }
            });

        } catch (Exception e){
            System.out.println("You have a problem!");
            System.out.println(e);
        }
    }
}