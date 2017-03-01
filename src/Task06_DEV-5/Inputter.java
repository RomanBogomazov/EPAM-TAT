package task06;

import java.util.Scanner;

/**
 * Class for input 
 */
public class Inputter {
    
  private int worth;
  private int productivity;
  private byte method;
    

/**
 * method for input
 */
  public void inputWorth() {
    System.out.println("Input your worth");
    Scanner in = new Scanner(System.in);
    worth=in.nextInt();
  }
    
  public void inputProductivity() {
    System.out.println("Input your productivity");
    Scanner in = new Scanner(System.in);
    productivity=in.nextInt();
  }
    
  public void inputMethod() {
    System.out.println("Input your method");
    System.out.println("Max Productivity: 1");
    System.out.println("Min Worth: 2");
    System.out.println("Max Juniors: 3");
    boolean repeat = true;
    while(repeat) {
      Scanner in = new Scanner(System.in);
      method=in.nextByte();
      if((method < 4) && (method > 0)) {
        repeat = false;
      }
    }      
  }
    
  public int returnWorth() {
    return worth;
  }
    
  public int returnProductivity() {
    return productivity;
  }
    
  public int returnMethod() {
    return method;
  }
}
