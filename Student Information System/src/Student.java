import java.util.*;
import java.io.*;


public class Student
	{
	 public static ArrayList <StudentInfo>student= new ArrayList<StudentInfo>(); 
	 public static void addStudent()throws IOException
		 {
		
		 Scanner file= new Scanner (new File("studentlist.txt")); 
		 
		    while(file.hasNext())
		    	{
		    	String studentfirstName;
		    	String studentlastName;
		    	double studentgpa;
		    	String studentperiod1;
		    	String studentgrade1; 
		    	String studentperiod2;
		    	String studentgrade2; 
		    	String studentperiod3;
		    	String studentgrade3; 
		    	 
		    	double newGPA; 
		    	 studentfirstName=file.next();
		    	 studentlastName=file.next();
		    	 studentgpa=0.00;
		    	 studentperiod1=file.next();
		    	 studentgrade1=file.next(); 
		    	 studentperiod2=file.next();
		    	 studentgrade2=file.next(); 
		    	 studentperiod3=file.next();
		    	 studentgrade3=file.next(); 
		    	 
		    	 newGPA= 0.00; 
		    	if(studentgrade1.equals("A+"))
		    		{
		    		newGPA=newGPA+ 4.30; 
		    		}
		    	else if(studentgrade1.equals("A"))
		    		{
		    		newGPA=newGPA+ 4.00; 
		    		}
		    	else if(studentgrade1.equals("A-"))
		    		{
		    		newGPA=newGPA+ 3.70; 
		    		}
		    	else if(studentgrade1.equals("B+"))
		    		{
		    		newGPA=newGPA+ 3.30; 
		    		}
		    	else if(studentgrade1.equals("B"))
		    		{
		    		newGPA=newGPA+ 3.00; 
		    		}
		    	else if(studentgrade1.equals("B-"))
		    		{
		    		newGPA=newGPA+ 2.70; 
		    		}
		    	else if(studentgrade1.equals("C+"))
		    		{
		    		newGPA=newGPA+ 2.30; 
		    		}
		    	else if(studentgrade1.equals("C"))
		    		{
		    		newGPA=newGPA+ 2.00; 
		    		}
		    	else if(studentgrade1.equals("C-"))
		    		{
		    		newGPA=newGPA+ 1.70; 
		    		}
		    	else if(studentgrade1.equals("D+"))
		    		{
		    		newGPA=newGPA+ 3.30; 
		    		}
		    	else if(studentgrade1.equals("D"))
		    		{
		    		newGPA=newGPA+ 3.00; 
		    		}
		    	else if(studentgrade1.equals("D-"))
		    		{
		    		newGPA=newGPA+ 2.70; 
		    		}
		    	else newGPA= newGPA; 
		    	if(studentgrade2.equals("A+"))
		    		{
		    		newGPA=newGPA+ 4.30; 
		    		}
		    	else if(studentgrade2.equals("A"))
		    		{
		    		newGPA=newGPA+ 4.00; 
		    		}
		    	else if(studentgrade2.equals("A-"))
		    		{
		    		newGPA=newGPA+ 3.70; 
		    		}
		    	else if(studentgrade2.equals("B+"))
		    		{
		    		newGPA=newGPA+ 3.30; 
		    		}
		    	else if(studentgrade2.equals("B"))
		    		{
		    		newGPA=newGPA+ 3.00; 
		    		}
		    	else if(studentgrade2.equals("B-"))
		    		{
		    		newGPA=newGPA+ 2.70; 
		    		}
		    	else if(studentgrade2.equals("C+"))
		    		{
		    		newGPA=newGPA+ 2.30; 
		    		}
		    	else if(studentgrade2.equals("C"))
		    		{
		    		newGPA=newGPA+ 2.00; 
		    		}
		    	else if(studentgrade2.equals("C-"))
		    		{
		    		newGPA=newGPA+ 1.70; 
		    		}
		    	else if(studentgrade2.equals("D+"))
		    		{
		    		newGPA=newGPA+ 3.30; 
		    		}
		    	else if(studentgrade2.equals("D"))
		    		{
		    		newGPA=newGPA+ 3.00; 
		    		}
		    	else if(studentgrade2.equals("D-"))
		    		{
		    		newGPA=newGPA+ 2.70; 
		    		}
		    	else newGPA= newGPA; 
		    	if(studentgrade3.equals("A+"))
		    		{
		    		newGPA=newGPA+ 4.30; 
		    		}
		    	else if(studentgrade3.equals("A"))
		    		{
		    		newGPA=newGPA+ 4.00; 
		    		}
		    	else if(studentgrade3.equals("A-"))
		    		{
		    		newGPA=newGPA+ 3.70; 
		    		}
		    	else if(studentgrade3.equals("B+"))
		    		{
		    		newGPA=newGPA+ 3.30; 
		    		}
		    	else if(studentgrade3.equals("B"))
		    		{
		    		newGPA=newGPA+ 3.00; 
		    		}
		    	else if(studentgrade3.equals("B-"))
		    		{
		    		newGPA=newGPA+ 2.70; 
		    		}
		    	else if(studentgrade3.equals("C+"))
		    		{
		    		newGPA=newGPA+ 2.30; 
		    		}
		    	else if(studentgrade3.equals("C"))
		    		{
		    		newGPA=newGPA+ 2.00; 
		    		}
		    	else if(studentgrade3.equals("C-"))
		    		{
		    		newGPA=newGPA+ 1.70; 
		    		}
		    	else if(studentgrade3.equals("D+"))
		    		{
		    		newGPA=newGPA+ 3.30; 
		    		}
		    	else if(studentgrade3.equals("D"))
		    		{
		    		newGPA=newGPA+ 3.00; 
		    		}
		    	else if(studentgrade3.equals("D-"))
		    		{
		    		newGPA=newGPA+ 2.70; 
		    		}
		    	else newGPA= newGPA; 
		    	newGPA= newGPA/3;
		    	int intGPA= (int)newGPA*100;
		    	newGPA=intGPA/100; 
		    	studentgpa=newGPA; 
		    	student.add(new StudentInfo(studentfirstName,studentlastName,studentgpa,studentperiod1,studentgrade1,studentperiod2,studentgrade2,studentperiod3,studentgrade3));
		    	}
		    	
		 }
	}
