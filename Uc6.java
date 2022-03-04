package employee;

public class Uc6 {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOURS = 20;
	public static final int no_of_working_day = 20;
	public static final int max_hrs_in_month = 100;

public static void main(String[] args) {
	
	       int totalempwage = 0,totalemphrs =0, totalworkingday = 0;
	       while (totalemphrs <= max_hrs_in_month && totalworkingday <  no_of_working_day ) {
	    	   
	    	   int emphrs = 0;
	    	   totalworkingday++;
	       
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
        totalemphrs += emphrs;
	   int empwage = emphrs *  EMP_RATE_PER_HOURS;
	   totalempwage += empwage;
	   System.out.println("emp wage :" + empwage );

}
	   System.out.println("total emp wage :" + totalempwage );
     }
}

