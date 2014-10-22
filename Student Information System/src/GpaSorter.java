

import java.util.Comparator; 
public class GpaSorter implements Comparator<StudentInfo>
	{
     public int compare(StudentInfo s1,StudentInfo s2)
    	 {
    	 if (s1.getGpa()<s2.getGpa())
    		 return 1;
    	 else 
    		 return -1;
    	 }

	}
