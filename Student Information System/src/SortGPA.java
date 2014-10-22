

import java.util.*;
public class SortGPA
	{
		public static void gpaSorted()
			{
			Collections.sort(Student.student,new GpaSorter());
			for(int i=0;i<Student.student.size();i++)
				{
				System.out.println(Student.student.get(i).getFirstName());
				}
			}
	}
