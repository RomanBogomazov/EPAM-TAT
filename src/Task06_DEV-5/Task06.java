package task06;

import java.util.ArrayList;

/**
 *
 * @author main
 */
public class Task06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListOfDevelopers listOfDevelopers= new ListOfDevelopers();
        listOfDevelopers.createListOfDevelopers();
        ListOfAmountOfEveryTypeDeveloper listOfAmountDevelopers = new ListOfAmountOfEveryTypeDeveloper();
        listOfAmountDevelopers.createList(listOfDevelopers.returnSizeOfListOfDevelopers());
        Inputter inputtingData = new Inputter();
        inputtingData.inputWorth();
        inputtingData.inputProductivity();
        inputtingData.inputMethod();
        MethodsOfComputation method = new MethodsOfComputation();
        method.inputWorth(inputtingData.returnWorth());
        method.inputProductivity(inputtingData.returnProductivity());
        method.inputMethod(inputtingData.returnMethod());
        method.inputListOfDevelopers(listOfDevelopers.returnListOfDevelopers());
        listOfAmountDevelopers.inputInList(method.returnResult());
        
        
        
        
        
        
        
        
        
        
        
        for(Developer developer:listOfDevelopers.returnListOfDevelopers()) {
            System.out.println(developer.getQualification());
            System.out.println(developer.getSalary());
            System.out.println(developer.getProductivity());
        }
        
        for(int i = 0; i < listOfAmountDevelopers.returnSizeOfList(); i++) {
            
            System.out.println(listOfAmountDevelopers.returnList().get(i));
        }
    }
    
}
