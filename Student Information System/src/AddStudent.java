import java.util.Scanner;

public class AddStudent
	{
	private static String firstName, lastName, firstPeriod;
	private static double gPA;
	private static int oneP;
	
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
		System.out.println("What 1st period is the new student in?");
		System.out.println();
		System.out.println("Your options are:");
		System.out.println("	1) Biology");
		System.out.println("	2) English");
		System.out.println("	3) Algebra");
		oneP = keyboard.nextInt();
		System.out.println();
		switch(oneP)
			{
			case 1:
				{
				firstPeriod.equals("Biology");
				}
				break;
			case 2:
				{
				firstPeriod.equals("English");
				}
				break;
			case 3:
				{
				firstPeriod.equals("Algebra");
				}
				break;
			default:
				{
				System.out.println("This is not an acceptable answer.");
				deadEnd();
				}
			}
		System.out.println("What is the GPA of the new student?");
		}
	
	public static void deadEnd()
		{
		System.out.println("Please restart the program.");
		}
	}
