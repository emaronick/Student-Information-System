import java.util.Scanner;
public class Menus
	{
	public static int answer;
	
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
		Scanner keyboard = new Scanner(System.in);
		answer = keyboard.nextInt();
		switch(answer)
			{
			case 1:
				{
				printAddOrDeleteMenu();
				determineAddOrDelete();
				}
				break;
			case 2:
				{
				printChangeStudentGradesOrSchedulesMenu();
				determineChangeStudentGradesOrSchedules();
				}
				break;
			case 3:
				{
				printSortStudentsMenu();
				determineSortingForm();
				}
				break;
			default:
				{
				System.out.println("I'm sorry, " + answer + " is not a valid entry. Please enter an integer 1, 2, or 3.");
				AddStudent.deadEnd();
				}
				break;
			}
		}
	
	public static void printAddOrDeleteMenu()
		{
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("	1) add a student");
		System.out.println("	2) delete a student");
		}
	
	public static void determineAddOrDelete()
		{
		Scanner keyboard = new Scanner(System.in);
		answer = keyboard.nextInt();
		switch(answer)
			{
			case 1:
				{
				AddStudent.addStudent();
				}
				break;
			case 2:
				{
				
				}
				break;
			default:
				{
				System.out.println("I'm sorry, " + answer + " is not a valid entry. Please enter an integer 1 or 2.");
				AddStudent.deadEnd();
				}
				break;
			}
		}
	
	public static void printChangeStudentGradesOrSchedulesMenu()
		{
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("	1) change student grades");
		System.out.println("	2) change student schedules");
		}
	
	public static void determineChangeStudentGradesOrSchedules()
		{
		Scanner keyboard = new Scanner(System.in);
		answer = keyboard.nextInt();
		switch(answer)
			{
			case 1:
				{
				
				}
				break;
			case 2:
				{
				SwitchClasses.switchClasses();
				}
				break;
			default:
				{
				System.out.println("I'm sorry, " + answer + " is not a valid entry. Please enter an integer 1 or 2.");
				AddStudent.deadEnd();
				}
				break;
			}
		}
	
	public static void printSortStudentsMenu()
		{
		System.out.println();
		System.out.println("What would you like to sort by?");
		System.out.println();
		System.out.println("	1) last name");
		System.out.println("	2) GPA");
		System.out.println("	3) class");
		}
	
	public static void determineSortingForm()
		{
		Scanner keyboard = new Scanner(System.in);
		answer = keyboard.nextInt();
		switch(answer)
			{
			case 1:
				{
				
				}
				break;
			case 2:
				{
				
				}
				break;
			case 3:
				{
				
				}
				break;
			default:
				{
				System.out.println("I'm sorry, " + answer + " is not a valid entry. Please enter an integer 1, 2, or 3.");
				AddStudent.deadEnd();
				}
				break;
			}
		}
	
	}
