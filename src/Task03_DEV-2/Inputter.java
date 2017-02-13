package main;

import java.util.Scanner;

/**
 * Class Inputter check, if user dont entered on the command line, enter from consol.
 * then conversion to string
 */
public class Inputter {
   
    /**
     * Only metod of Class Inputter check, if user dont entered on the command line, enter from consol.
     * then conversion to string
	 * @param args command line arguments
	 * @return our expression in one line
     */
	String Input(String[] args) {
        
        String line;
        if(args.length==0)
        {
            Scanner in = new Scanner(System.in);
            line=in.nextLine();
            line = line.replaceAll(" ", "");
        }
        else
        {
            StringBuilder stringBuilder = new StringBuilder();
            for (String arg : args) {
                stringBuilder.append(arg);
            }
            line=stringBuilder.toString();
        }
        return line;
    }
}
