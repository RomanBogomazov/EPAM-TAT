import java.util.*;
/* Now only drop input string*/

public class List
{
	public static void main(String[] args) {
	int count = 0, average = 0;
	String answer = "yes", yes = "yes", no = "no";
	Scanner in = new Scanner(System.in);
	Input start = new Input();
	Person[] persons = new Person[100];

	for(int i = 0; i < 10; i++)
	{
		persons[i] = new Person();
		start.go(persons[i]);
		System.out.print("Continue(yes/no): ");
		answer = in.nextLine();
		count ++;
		if(answer.equals(no)) break;
	}


	Operations operations = new Operations();

	System.out.println();
	System.out.println("Average = " + operations.average(persons, count));

	System.out.println();
	System.out.println("Max age = " + operations.max_age(persons, count));

	System.out.println();
	System.out.println("Popular female name = " + operations.popular_female_name(persons, count));
	}
}