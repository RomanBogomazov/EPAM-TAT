package main;

/**
 * Class CheckerOfLine, for allowed values.
 */
public class CheckerOfLine {
    
	/**
     * metod checkForNumber, checks on the number
	 * @param char from line 
	 * @return boolean
     */
    boolean checkForNumber(char line) {
        switch(line) {
                case '0':
                    return true;
                case '1':
                    return true;
                case '2':
                    return true;
                case '3':
                    return true;
                case '4':
                    return true;
                case '5':
                    return true;
                case '6':
                    return true;
                case '7':
                    return true;
                case '8':
                    return true;
                case '9':
                    return true;
                default:
                    return false;
        }
    }
    
    /**
     * metod check, checks on the rules and allowed values
	 * @param our line 
     */
    void check(String line) {
        
        for(int i = 0; i < line.length(); i++) 
            
            if (!checkForNumber(line.charAt(i))) {
                switch(line.charAt(i)) {
                case '/':
                    if(!(checkForNumber(line.charAt(i-1)))) System.exit(2);
                    if(!(checkForNumber(line.charAt(i+1)))) System.exit(3);
                    break;
                case '*':
                    if(!(checkForNumber(line.charAt(i-1)))) System.exit(4);
                    if(!(checkForNumber(line.charAt(i+1)))) System.exit(5);
                    break;
                case '+':
                    if(!((checkForNumber(line.charAt(i-1)))||(line.charAt(i-1)=='e'))) System.exit(6);
                    if(!(checkForNumber(line.charAt(i+1)))) System.exit(7);
                    break;
                case '-':
                    if(!((checkForNumber(line.charAt(i-1)))||(line.charAt(i-1)=='e'))) System.exit(8);
                    if(!(checkForNumber(line.charAt(i+1)))) System.exit(9);
                    break;
                case 'e':
                    if(!(checkForNumber(line.charAt(i-1)))) System.exit(10);
                    if(!(((line.charAt(i+1))=='+')||((line.charAt(i+1))=='-'))) System.exit(11);
                    break;
                case '.':
                    if(!(checkForNumber(line.charAt(i-1)))) System.exit(12);
                    if(!(checkForNumber(line.charAt(i+1)))) System.exit(13);
                    break;
                default:
                    System.exit(14);
                    break;
                }
            }
    }
}
