/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task06;

import java.util.ArrayList;

/**
 *
 * @author mini
 */
public class ListOfAmountOfEveryTypeDeveloper {
    
    private ArrayList<Integer> list = new ArrayList<>();
    
    public void createList(int numbersOfDevelopers) {
        for(int i = 0; i < numbersOfDevelopers; i++) {
            list.add(0);
        }
        // TODO: list.ensureCapacity(numbersOfDevelopers);
    }
    
    public ArrayList<Integer> returnList() {
        return list;
    }
    
    public int returnSizeOfList() {
        return list.size();
    }
    
    public boolean checkInputtingListForSize(ArrayList<Integer> checkingList) {
        if(checkingList.size()==list.size()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void inputInList(ArrayList<Integer> inputtingList) {
        if  (checkInputtingListForSize(inputtingList)) {
            for(int i = 0; i < list.size(); i++) {
                list.set(i, inputtingList.get(i));
            }
        } else {
            throw new RuntimeException("Not equals size of inputting and created list of amount of every type developer");
        }
    }
}
