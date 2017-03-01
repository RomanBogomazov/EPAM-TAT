package main;

import java.util.Scanner;


/**
 * Main class of application. 
 */
public class Main {

/**
 * Main metod of application. 
 * @param args command line arguments
 */
    public static void main(String[] args) {
        
        String line;

        Inputter inputter = new Inputter();
        line = inputter.Input(args);
        
        CheckerOfLine checkerOfLine = new CheckerOfLine();
        checkerOfLine.check(line);
        
        Calculator calculator = new Calculator();
        calculator.Calculate(line);
    }
}
