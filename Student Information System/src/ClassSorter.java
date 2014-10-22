import java.util.Comparator;



public class ClassSorter
		{
		public int compare (StudentInfo s1, StudentInfo s2)
			{
			//could be that classSortChoice isnt what menus has.
			
			return s1.getPeriod1().compareTo(s2.getPeriod1());
			return s1.getPeriod2().compareTo(s2.getPeriod2());
			return s1.getPeriod3().compareTo(s2.getPeriod3());
			}
		}