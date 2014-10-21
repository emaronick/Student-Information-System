import java.util.Comparator;



public class ClassSorter
		{
		public int compare (StudentInfo s1, StudentInfo s2)
			{
			//could be that classSortChoice isnt what menus has.
			if(Menus.classSortChoice == 1) return s1.getClassP1().compareTo(s2.getClassP1());
			else if(Menus.classSortChoice == 2) return s1.getClassP2().compareTo(s2.getClassP2());
			else return s1.getClassP3().compareTo(s2.getClassP3());
			}
		}