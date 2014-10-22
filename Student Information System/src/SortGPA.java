

import java.util.*;
public class SortGPA
	{
		public static void gpaSorted()
			{
			Collections.sort(Student.student,new GpaSorter());
			
			}
	}
