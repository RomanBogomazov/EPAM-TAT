/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task06;

import java.util.ArrayList;

/**
 *
 * @author main
 */
public class ListOfDevelopers {
    private ArrayList<Developer> list = new ArrayList<>();
    
    public void createListOfDevelopers() {
        InputterDevelopers inpDev = new InputterDevelopers();
        list = inpDev.inputDevelopers();
    } 
    
    public ArrayList<Developer> returnListOfDevelopers() {
        return list;
    }
    
    public int returnSizeOfListOfDevelopers() {
        return list.size();
    }
}
