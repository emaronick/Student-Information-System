import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class DeleteStudent
	

	{
	 
		static ArrayList <Student> roster = new ArrayList<Student>();
		static int addOrDelete,studentToDelete;
		static int  studentNumber = 1;
		static int confirmDelete;
		static String studentfirstName,  studentlastName, firstPeriod, firstPeriodGrade, secondPeriod, secondPeriodGrade, thirdPeriod, thirdPeriodGrade;
		
		public static void deleteStudent()

	
		{
	
	
		{
		System.out.println(studentNumber + s.getFirstName() + " " + s.getLastName() + ">>> " + s.getPeriodOne() + ": " + s.getPeriodOneGrade() + "| " + s.getPeriodTwo() + ": " + s.getPeriodTwoGrade() + "| " + s.getPeriodThree() + ": " + s.getPeriodThreeGrade() + "|");			
		studentNumber++;
		}
	
	Scanner userInput = new Scanner(System.in);
	studentToDelete = userInput.nextInt();
	
	System.out.println("Are you sure you would like to delete " + roster.get(studentToDelete - 1).getstudentfirstName());
	System.out.println("\n1) Yes");
	System.out.println("\n2) No ");
	
	
	switch(confirmDelete)
		{
		case 1:
			{
			roster.remove(studentToDelete);
			System.out.println("\nThe student was successfully deleted");
			break;
			}
		case 2:
				{
			deleteStudent();
			break;
				}
			}
		}
	}
