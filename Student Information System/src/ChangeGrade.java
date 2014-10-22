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
						}
					else if(periodChoice==2)
						{
						System.out.println("The grade is "+Student.student.get(studentNumber-1).getGrade2()+". What grade do you want to change into?");
						Scanner keypad3= new Scanner(System.in);
						String newGrade= keypad3.nextLine(); 
						Student.student.get(studentNumber-1).setGrade2(newGrade); 
						}
					else if(periodChoice==3)
						{
						System.out.println("The grade is "+Student.student.get(studentNumber-1).getGrade3()+". What grade do you want to change into?");
						Scanner keypad3= new Scanner(System.in);
						String newGrade= keypad3.nextLine(); 
						Student.student.get(studentNumber-1).setGrade3(newGrade); 
						}
					
			    	}
			    	else
			    		{
			    		wrongStudent=true;
			    		}
			 
			
			    }while(wrongStudent); 
			
				
			}
		
		
	}

