import java.util.Scanner;

public class AddStudent
	{
	private static String firstName, lastName;
	private static double gPA;
	
	public static void addStudent()
		{
		promptAllInput();
		}
	
	public static void promptAllInput()
		{
		System.out.println("What is the first name of the new student?");
		Scanner keyboard = new Scanner(System.in);
		firstName = keyboard.nextLine();
		System.out.println();
		System.out.println("What is the last name of the new student?");
		lastName = keyboard.nextLine();
		System.out.println();
		System.out.println("What is the GPA of the new student?");
		gPA = keyboard.nextDouble();
		System.out.println();
		System.out.println("What 1st period would you like to put the new student in?");
		lastName = keyboard.nextLine();
		System.out.println();
		System.out.println("What is the GPA of the new student?");
		}
	}
