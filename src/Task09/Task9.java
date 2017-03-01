/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mini
 */
public class Task9 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, Exception {
        Inputter inputter = new Inputter();
        String string = inputter.input();
        Checker checker = new Checker();
        checker.check(string);
        Tokenizator tokenizator = new Tokenizator();
        ArrayList list = tokenizator.tokenizeOnSpecSymbols(string);
        checker.firstGeneralCheck(list);
        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(string);
    }
    
}
