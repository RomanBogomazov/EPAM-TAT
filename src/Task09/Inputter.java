/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mini
 */
public class Inputter {
    public String input() throws IOException{
        System.out.println("Input time and date in format: (day)/(month)/(year) (hour):(minutes):(seconds)");
        System.out.println("Examplle: 21/3/2000 12:01:07");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        return string;
    }
}
