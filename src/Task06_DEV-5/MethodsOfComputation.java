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
public class MethodsOfComputation {
    
    ArrayList<Integer> resultList = new ArrayList();
    private ArrayList<Developer> listOfDevelopers = new ArrayList<>();
    ArrayList<Integer> newList = new ArrayList();
    private int worth;
    private int productivity;
    private int method;
    
    public ArrayList<Integer> returnResult() {
        switch(method) {
            case 1: {
                this.methodOfMaxProductivity();
                return resultList;
            } 
            case 2: {
                this.methodOfMinWorth();
                return resultList;
            }
            case 3: {
                this.methodOfMaxJuniors();
                return resultList;
            }
            default: {
                throw new RuntimeException("Not exist that method");
            }
        }
    }

    void inputWorth(int returnWorth) {
        worth = returnWorth;
    }

    void inputProductivity(int returnProductivity) {
        productivity = returnProductivity;
    }

    void inputMethod(int returnMethod) {
        method = returnMethod;
    }

    private void methodOfMaxProductivity() {
        
        for(int i = 0; i < listOfDevelopers.size(); i++) {
                newList.add(worth/listOfDevelopers.get(i).getSalary());
        }
        for(int i = 0; i <= newList.get(0); i++) {
            for(int j = 0; i <= newList.get(1); j++) {
                for(int k = 0; k <= newList.get(2); k++) {
                    int l = (worth - i*listOfDevelopers.get(0).getSalary() - j*listOfDevelopers.get(1).getSalary() - k*listOfDevelopers.get(2).getSalary())/listOfDevelopers.get(2).getSalary();
                    
                } 
            } 
        }  
    }

    private void methodOfMaxJuniors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void methodOfMinWorth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void inputListOfDevelopers(ArrayList<Developer> returnListOfDevelopers) {
        listOfDevelopers = returnListOfDevelopers;
        
    }
}
