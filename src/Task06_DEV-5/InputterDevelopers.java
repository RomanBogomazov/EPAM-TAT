/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author main
 */
class InputterDevelopers {
    
    private ArrayList<Developer> list = new ArrayList<>();
    
    public ArrayList<Developer> inputDevelopers() {
        if (this.checkForChangesDefaultSettings()) {
            return this.inputDefaultDevelopers();
        } else {
            return this.inputNotDefaultDevelopers();
        }
        
    }
    
    public boolean checkForChangesDefaultSettings() {
        System.out.println("Do you want to use default salary and productivity?");
        Scanner in = new Scanner(System.in);
        String string=in.nextLine();
        if(string.equals("true")) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Developer> inputDefaultDevelopers() {
        Junior junior = new Junior(150, 1);
        Middle middle = new Middle(290, 2);
        Senior senior = new Senior(430, 3);
        Lead lead = new Lead(560, 4);
        list.add(junior);
        list.add(middle);
        list.add(senior);
        list.add(lead);
        return list;
    }
            
    public ArrayList<Developer> inputNotDefaultDevelopers() {
        list.add(this.inputNotDefaultJunior());
        list.add(this.inputNotDefaultMiddle());
        list.add(this.inputNotDefaultSenior());
        list.add(this.inputNotDefaultLead());
        return list;
    }
    
    public Junior inputNotDefaultJunior() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input new salary of Junior");
        int salary=in.nextInt();
        System.out.println("Input new productivity of Junior");
        int productivity=in.nextInt();
        return new Junior(salary, productivity);
    }
    
    public Middle inputNotDefaultMiddle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input new salary of Middle");
        int salary=in.nextInt();
        System.out.println("Input new productivity of Middle");
        int productivity=in.nextInt();
        return new Middle(salary, productivity);
    }
    
    public Senior inputNotDefaultSenior() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input new salary of Senior");
        int salary=in.nextInt();
        System.out.println("Input new productivity of Senior");
        int productivity=in.nextInt();
        return new Senior(salary, productivity);
    }
    
    public Lead inputNotDefaultLead() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input new salary of Lead");
        int salary=in.nextInt();
        System.out.println("Input new productivity of Lead");
        int productivity=in.nextInt();
        return new Lead(salary, productivity);
    }
}
