/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task06;

/**
 *
 * @author main
 */
public class Senior extends Developer {
    
    private String qualification;
    private int salary;
    private int productivity;
    
    public Senior(int salary, int productivity) {
    this.qualification = "Senior";
    this.salary = salary;
    this.productivity = productivity;
    }
    
    @Override
    public String getQualification() {
        return qualification;
    }

    @Override
    public int getSalary() {
        return salary;
    }
        
    @Override
    public int getProductivity() {
        return productivity;
    }
}
