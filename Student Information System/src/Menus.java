import java.util.Scanner;
public class Menus
	{
	public static int answer1;
	public static boolean acceptable = false;
	
	public static void printMainMenu()
		{
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("	1) add or delete a student");
		System.out.println("	2) change student grades or schedules");
		System.out.println("	3) sort students");
		}
	
	public static void determineSubMenu()
		{
		acceptable = false;
		while(acceptable = false)
			{
			Scanner keyboard = new Scanner(System.in);
			answer1 = keyboard.nextInt();
			switch(answer1)
				{
				case 1:
					{
					acceptable = true;
					}
					break;
				case 2:
					{
					acceptable = true;
					}
					break;
				case 3:
					{
					acceptable = true;
					}
					break;
				default:
					{
					System.out.println("I'm sorry, " + answer1 + " is not a valid entry. Please enter an integer between one and three.");
					acceptable = false;
					}
					break;
				}
			}
		System.out.println("good");
		}
	}
