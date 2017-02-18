import java.util.Scanner;
/* Now only drop input string*/

public class Calculator
{
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	int first = 0, last = 0, count = 0;
	String virajenie = in.nextLine();
	String[] symbols = new String[virajenie.length()];
	for(int i = 0; i < virajenie.length(); i++)
		if(virajenie.charAt(i) == ' ') {
			last = i; symbols[count] = virajenie.substring(first,last);
			first = last+1; count++;}
	}
}
