import java.util.*;
import java.io.*;
public class StudentInfo
	{  private static String firstName;
	   private static String lastName;
	   private static double gpa;
	   private static String period1;
	   private static String grade1;
	   private static String period2;
	   private static String grade2;
	   private static String period3;
	   private static String grade3;
	   private static ArrayList <StudentInfo>student= new ArrayList<StudentInfo>(); 
	    
		
	    public  StudentInfo( String fn, String ln, double g, String p1, String g1, String p2, String g2, String p3, String g3)
			{
			firstName= fn;
			lastName= ln;
			gpa=g;
			period1=p1;
			grade1=g1;
			period2=p2;
			grade2=g2;
			period3=p3;
			grade3=g3; 
			
		
			
			}
	    
		public static String getFirstName()
			{
			return firstName;
			}

		public static String getLastName()
			{
			return lastName;
			}

		public static double getGpa()
			{
			return gpa;
			}

		public static String getPeriod1()
			{
			return period1;
			}

		public static String getGrade1()
			{
			return grade1;
			}

		public static String getPeriod2()
			{
			return period2;
			}

		public static String getGrade2()
			{
			return grade2;
			}

		public static String getPeriod3()
			{
			return period3;
			}

		public static String getGrade3()
			{
			return grade3;
			}


		public static void setFirstName(String firstName)
			{
			StudentInfo.firstName = firstName;
			}

		public static void setLastName(String lastName)
			{
			StudentInfo.lastName = lastName;
			}

		public static void setGpa(double gpa)
			{
			StudentInfo.gpa = gpa;
			}

		public static void setPeriod1(String period1)
			{
			StudentInfo.period1 = period1;
			}

		public static void setGrade1(String grade1)
			{
			StudentInfo.grade1 = grade1;
			}

		public static void setPeriod2(String period2)
			{
			StudentInfo.period2 = period2;
			}

		public static void setGrade2(String grade2)
			{
			StudentInfo.grade2 = grade2;
			}

		public static void setPeriod3(String period3)
			{
			StudentInfo.period3 = period3;
			}

		public static void setGrade3(String grade3)
			{
			StudentInfo.grade3 = grade3;
			}

		
		
		
		
		
		public static void main(String[] args) throws IOException
		{
		Scanner file= new Scanner (new File("studentlist.txt"));
	    while(file.hasNextLine())
	    	{
	    	firstName=file.next();
	    	lastName=file.next();
	    	gpa=0.00;
	    	period1=file.next();
	    	grade1=file.next(); 
	    	period2=file.next();
	    	grade2=file.next(); 
	    	period3=file.next();
	    	grade3=file.next(); 
	    	student.add(new StudentInfo(firstName,lastName,gpa,period1,grade1,period2,grade2,period3,grade3)); 
	    	double newGPA= 0.00; 
	    	if(grade1.equals("A+"))
	    		{
	    		newGPA=newGPA+ 4.30; 
	    		}
	    	else if(grade1.equals("A"))
	    		{
	    		newGPA=newGPA+ 4.00; 
	    		}
	    	else if(grade1.equals("A-"))
	    		{
	    		newGPA=newGPA+ 3.70; 
	    		}
	    	else if(grade1.equals("B+"))
	    		{
	    		newGPA=newGPA+ 3.30; 
	    		}
	    	else if(grade1.equals("B"))
	    		{
	    		newGPA=newGPA+ 3.00; 
	    		}
	    	else if(grade1.equals("B-"))
	    		{
	    		newGPA=newGPA+ 2.70; 
	    		}
	    	else if(grade1.equals("C+"))
	    		{
	    		newGPA=newGPA+ 2.30; 
	    		}
	    	else if(grade1.equals("C"))
	    		{
	    		newGPA=newGPA+ 2.00; 
	    		}
	    	else if(grade1.equals("C-"))
	    		{
	    		newGPA=newGPA+ 1.70; 
	    		}
	    	else if(grade1.equals("D+"))
	    		{
	    		newGPA=newGPA+ 3.30; 
	    		}
	    	else if(grade1.equals("D"))
	    		{
	    		newGPA=newGPA+ 3.00; 
	    		}
	    	else if(grade1.equals("D-"))
	    		{
	    		newGPA=newGPA+ 2.70; 
	    		}
	    	else newGPA= newGPA; 
	    	if(grade2.equals("A+"))
	    		{
	    		newGPA=newGPA+ 4.30; 
	    		}
	    	else if(grade2.equals("A"))
	    		{
	    		newGPA=newGPA+ 4.00; 
	    		}
	    	else if(grade2.equals("A-"))
	    		{
	    		newGPA=newGPA+ 3.70; 
	    		}
	    	else if(grade2.equals("B+"))
	    		{
	    		newGPA=newGPA+ 3.30; 
	    		}
	    	else if(grade2.equals("B"))
	    		{
	    		newGPA=newGPA+ 3.00; 
	    		}
	    	else if(grade2.equals("B-"))
	    		{
	    		newGPA=newGPA+ 2.70; 
	    		}
	    	else if(grade2.equals("C+"))
	    		{
	    		newGPA=newGPA+ 2.30; 
	    		}
	    	else if(grade2.equals("C"))
	    		{
	    		newGPA=newGPA+ 2.00; 
	    		}
	    	else if(grade2.equals("C-"))
	    		{
	    		newGPA=newGPA+ 1.70; 
	    		}
	    	else if(grade2.equals("D+"))
	    		{
	    		newGPA=newGPA+ 3.30; 
	    		}
	    	else if(grade2.equals("D"))
	    		{
	    		newGPA=newGPA+ 3.00; 
	    		}
	    	else if(grade2.equals("D-"))
	    		{
	    		newGPA=newGPA+ 2.70; 
	    		}
	    	else newGPA= newGPA; 
	    	if(grade3.equals("A+"))
	    		{
	    		newGPA=newGPA+ 4.30; 
	    		}
	    	else if(grade3.equals("A"))
	    		{
	    		newGPA=newGPA+ 4.00; 
	    		}
	    	else if(grade3.equals("A-"))
	    		{
	    		newGPA=newGPA+ 3.70; 
	    		}
	    	else if(grade3.equals("B+"))
	    		{
	    		newGPA=newGPA+ 3.30; 
	    		}
	    	else if(grade3.equals("B"))
	    		{
	    		newGPA=newGPA+ 3.00; 
	    		}
	    	else if(grade3.equals("B-"))
	    		{
	    		newGPA=newGPA+ 2.70; 
	    		}
	    	else if(grade3.equals("C+"))
	    		{
	    		newGPA=newGPA+ 2.30; 
	    		}
	    	else if(grade3.equals("C"))
	    		{
	    		newGPA=newGPA+ 2.00; 
	    		}
	    	else if(grade3.equals("C-"))
	    		{
	    		newGPA=newGPA+ 1.70; 
	    		}
	    	else if(grade3.equals("D+"))
	    		{
	    		newGPA=newGPA+ 3.30; 
	    		}
	    	else if(grade3.equals("D"))
	    		{
	    		newGPA=newGPA+ 3.00; 
	    		}
	    	else if(grade3.equals("D-"))
	    		{
	    		newGPA=newGPA+ 2.70; 
	    		}
	    	else newGPA= newGPA; 
	    	newGPA=newGPA/3; 
	    	}
	    	
	    	}
		}

	