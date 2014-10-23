import java.util.Scanner;
public class ChangeGrade
	{  
		
		public static void gradeChanger()
			{ boolean wrongStudent= true;
  
			do{
				System.out.println("What is the first name of the student you want to change?");
				for(int i=0; i<Student.student.size();i++)
					{
					System.out.print("("+(i+1)+") : ");
					System.out.println(Student.student.get(i).getFirstName());
					}
				Scanner keypad= new Scanner (System.in); 
				int studentNumber= keypad.nextInt();
				
				
				System.out.println("You want to change "+Student.student.get(studentNumber-1).getFirstName()+"'s grade. Right?");
				
			    System.out.println("(1) Yes");
			    System.out.println("(2) No");
			    Scanner keyboard = new Scanner(System.in);
			    int right = keyboard.nextInt(); 
			    			    
			    
			    	if(right==1)
			    
			    	{
			    	
			    	wrongStudent=false; 
			    	System.out.println("Which period's grade do you want to change?");
					System.out.println("(1) "+Student.student.get(studentNumber-1).getPeriod1());
					System.out.println("(2) "+Student.student.get(studentNumber-1).getPeriod2());
					System.out.println("(3) "+Student.student.get(studentNumber-1).getPeriod3());
					Scanner keypad2 = new Scanner(System.in);
					int periodChoice = keypad2.nextInt();
					if(periodChoice==1)
						{
						System.out.println("The grade is "+Student.student.get(studentNumber-1).getGrade1()+". What grade do you want to change into?");
						Scanner keypad3= new Scanner(System.in);
						String newGrade= keypad3.nextLine(); 
						Student.student.get(studentNumber-1).setGrade1(newGrade); 
						double newGPA= changeGPA(studentNumber); 
					    	Student.student.get(studentNumber-1).setGpa(newGPA); 
						}
					else if(periodChoice==2)
						{
						System.out.println("The grade is "+Student.student.get(studentNumber-1).getGrade2()+". What grade do you want to change into?");
						Scanner keypad3= new Scanner(System.in);
						String newGrade= keypad3.nextLine(); 
						Student.student.get(studentNumber-1).setGrade2(newGrade);
						double newGPA= changeGPA(studentNumber); 

				    	Student.student.get(studentNumber-1).setGpa(newGPA); 
						}
					else if(periodChoice==3)
						{
						System.out.println("The grade is "+Student.student.get(studentNumber-1).getGrade3()+". What grade do you want to change into?");
						Scanner keypad3= new Scanner(System.in);
						String newGrade= keypad3.nextLine(); 
						Student.student.get(studentNumber-1).setGrade3(newGrade); 
						double newGPA=changeGPA(studentNumber);  
				    	Student.student.get(studentNumber-1).setGpa(newGPA); 
						}
					
			    	}
			    	else
			    		{
			    		wrongStudent=true;
			    		}
			    	
			
			    }while(wrongStudent); 
			
				
			}
		public static double changeGPA(int studentNumber)
			{
			double newGPA= 0.00; 
	    	if(Student.student.get(studentNumber-1).getGrade1().equals("A+"))
	    		{
	    		newGPA=newGPA+ 4.30; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade1().equals("A"))
	    		{
	    		newGPA=newGPA+ 4.00; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade1().equals("A-"))
	    		{
	    		newGPA=newGPA+ 3.70; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade1().equals("B+"))
	    		{
	    		newGPA=newGPA+ 3.30; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade1().equals("B"))
	    		{
	    		newGPA=newGPA+ 3.00; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade1().equals("B-"))
	    		{
	    		newGPA=newGPA+ 2.70; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade1().equals("C+"))
	    		{
	    		newGPA=newGPA+ 2.30; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade1().equals("C"))
	    		{
	    		newGPA=newGPA+ 2.00; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade1().equals("C-"))
	    		{
	    		newGPA=newGPA+ 1.70; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade1().equals("D+"))
	    		{
	    		newGPA=newGPA+ 3.30; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade1().equals("D"))
	    		{
	    		newGPA=newGPA+ 3.00; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade1().equals("D-"))
	    		{
	    		newGPA=newGPA+ 2.70; 
	    		}
	    	else newGPA= newGPA; 
	    
	    	
	    	if(Student.student.get(studentNumber-1).getGrade2().equals("A+"))
	    		{
	    		newGPA=newGPA+ 4.30; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade2().equals("A"))
	    		{
	    		newGPA=newGPA+ 4.00; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade2().equals("A-"))
	    		{
	    		newGPA=newGPA+ 3.70; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade2().equals("B+"))
	    		{
	    		newGPA=newGPA+ 3.30; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade2().equals("B"))
	    		{
	    		newGPA=newGPA+ 3.00; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade2().equals("B-"))
	    		{
	    		newGPA=newGPA+ 2.70; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade2().equals("C+"))
	    		{
	    		newGPA=newGPA+ 2.30; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade2().equals("C"))
	    		{
	    		newGPA=newGPA+ 2.00; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade2().equals("C-"))
	    		{
	    		newGPA=newGPA+ 1.70; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade2().equals("D+"))
	    		{
	    		newGPA=newGPA+ 3.30; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade2().equals("D"))
	    		{
	    		newGPA=newGPA+ 3.00; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade2().equals("D-"))
	    		{
	    		newGPA=newGPA+ 2.70; 
	    		}
	    	else newGPA= newGPA; 
	    	if(Student.student.get(studentNumber-1).getGrade3().equals("A+"))
	    		{
	    		newGPA=newGPA+ 4.30; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade3().equals("A"))
	    		{
	    		newGPA=newGPA+ 4.00; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade3().equals("A-"))
	    		{
	    		newGPA=newGPA+ 3.70; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade3().equals("B+"))
	    		{
	    		newGPA=newGPA+ 3.30; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade3().equals("B"))
	    		{
	    		newGPA=newGPA+ 3.00; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade3().equals("B-"))
	    		{
	    		newGPA=newGPA+ 2.70; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade3().equals("C+"))
	    		{
	    		newGPA=newGPA+ 2.30; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade3().equals("C"))
	    		{
	    		newGPA=newGPA+ 2.00; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade3().equals("C-"))
	    		{
	    		newGPA=newGPA+ 1.70; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade3().equals("D+"))
	    		{
	    		newGPA=newGPA+ 3.30; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade3().equals("D"))
	    		{
	    		newGPA=newGPA+ 3.00; 
	    		}
	    	else if(Student.student.get(studentNumber-1).getGrade3().equals("D-"))
	    		{
	    		newGPA=newGPA+ 2.70; 
	    		}

	    	
	    	newGPA= newGPA/3;
	    	int intGPA= (int)(newGPA*100);
	    	newGPA=intGPA/100.00; 
	    	return newGPA; 
			}
		
		
	}
