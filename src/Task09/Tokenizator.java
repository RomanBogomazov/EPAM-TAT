/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author mini
 */
public class Tokenizator {
    private ArrayList list = new ArrayList();
    private String stringWithSpecSymbols = " /:";
    public ArrayList tokenizeOnSpecSymbols(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string,stringWithSpecSymbols);
        while(stringTokenizer.hasMoreTokens()) {
            list.add(stringTokenizer.nextToken());
        }
        return list;
    }
}
 