package employee;

public class Uc4 {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOURS = 20;
	public static final int no_of_working_day = 20;


public static void main(String[] args) {
	
	       int emphrs = 0, empwage = 0, totalempwage = 0;
	for (int day = 0; day < no_of_working_day; day++) {
		int empcheck = (int) Math.floor(Math.random() * 10) % 3 ;
        switch (empcheck) {
	   
		   case IS_FULL_TIME:
                emphrs = 8;
                break;
		   case IS_PART_TIME:
		        emphrs = 4;
		        break;
		   default:
		        emphrs = 0;
	    }
	   empwage = emphrs *  EMP_RATE_PER_HOURS;
	   totalempwage += empwage;
	   System.out.println("emp wage :" + empwage );

}
	   System.out.println("total emp wage :" + totalempwage );
     }
}

