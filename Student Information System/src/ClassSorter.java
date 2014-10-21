import java.util.Comparator;



public class ClassSorter
		{
		public int compare (Student s1, Student s2)
			{
			if(s1.getClass() > s2.getClass())
				return 1;
			else
				return-1;
			}
		}
	
	
