/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9;

import java.util.ArrayList;

/**
 *
 * @author mini
 */
public class Checker {
    private int indexOfDay=0;
    private int indexOfMonth=1;
    private int indexOfYear=2;
    private int indexOfHours=3;
    private int indexOfMinutes=4;
    private int indexOfSeconds=5;
    private static final String regexForDateAndTime = "^\\d{1,2}\\/\\d{1,2}\\/\\d+\\s{1}\\d{1,2}\\:\\d{1,2}\\:\\d{1,2}";
    public void check(String string) throws Exception {
        if(string == null) {
            throw new Exception("String is null");
        }
        if(string == "") {
            throw new Exception("String is not have elements");
        }
        if(!string.matches(regexForDateAndTime)) {
            throw new Exception("String is not valid format.");
        }
    }
    public boolean firstGeneralCheck(ArrayList list) throws Exception {
        for(int i = 0; i<list.size(); i++) {
            int element = Integer.parseInt((String) list.get(i));
            if(list.get(i) == null) {
                throw new Exception("element is null");
            }
            if(element<0) {
                throw new Exception("element is < 0");
            }
        }
        return true;
    }
    public boolean generalCheck(ArrayList list) {
        if(checkForTime(list)) {
        int numberOfYear = Integer.parseInt((String) list.get(indexOfYear));
            if(numberOfYear>-1) {
                if(numberOfYear%4==0) {
                    if(numberOfYear%100==0) {
                    } else {
                        
                    }
                } else {
                   //невисоконый
                }
            }
        }
    }

    private boolean checkForTime(ArrayList list) {
        int numberOfSecond = Integer.parseInt((String) list.get(indexOfSeconds));
        if(0<numberOfSecond&&60>numberOfSecond) {
            int numberOfMinutes = Integer.parseInt((String) list.get(indexOfMinutes));
            if(-1<numberOfMinutes&&60>numberOfMinutes) {
                int numberOfHours = Integer.parseInt((String) list.get(indexOfHours));
                if(-1<numberOfHours&&24>numberOfMinutes) {
                    return true;
                }
            }
        }
        return false;
    }
}

