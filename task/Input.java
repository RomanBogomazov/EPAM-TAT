import java.util.*;

class Input
{
	public static void go (Person persons) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("First name: ");
		persons.name = in.nextLine();
		System.out.print("Second name: ");
		persons.sername = in.nextLine();
		System.out.print("Sex(male/female): ");
		persons.sex = in.nextLine();
		System.out.print("Age: ");
		persons.age = in.nextLine();
	}
}