public class EmpWageBuilderUC
{
	public static final int WAGE_PER_HOUR = 20;
        public static final byte FULL_DAY_HOUR = 8;
        public static final byte HALF_DAY_HOUR = 4;
	public static final int TOTAL_WORKING_DAYS = 20;
        public static final int TOTAL_WORKING_HOURS = 100;

	public static void main(String[] agrs)
	{
		System.out.println("calculate employee wage");
		//constants
		int empWage = 0;
		int empWageFullDay = 0;
                int empWageHalfDay = 0;
                int totalWorkingDays = 0;
                int totalWorkingHour = 0;
                int totalWage = 0;
                int wage = 0;
		int is_present = 1;
		int workingHour = 0;
		//Computation
		while(totalWorkingDays <= TOTAL_WORKING_DAYS && totalWorkingHour <= TOTAL_WORKING_HOURS)
		{
			double empCheck = Math.floor(Math.random() * 10) % 3;
                	int empCheckFullPartAbsent = (int) empCheck;
			switch(empCheckFullPartAbsent)
                		{
                		case 0:
                        		empWageHalfDay = WAGE_PER_HOUR * HALF_DAY_HOUR;
					wage = wage + empWageHalfDay;
                        		System.out.println("employee half day");
                        		workingHour = HALF_DAY_HOUR;
					break;
               			case 1:
                        		empWageFullDay = WAGE_PER_HOUR * FULL_DAY_HOUR;
                        		wage = wage + empWageFullDay;
					workingHour = FULL_DAY_HOUR;
					System.out.println("employee full day");
                        		break;
                		default:
                        		System.out.println("employee wage = 0");
                        		break;
			}
			totalWorkingHour = totalWorkingHour + workingHour;
			totalWorkingDays++;
			totalWage = totalWage + wage;
		}
		System.out.println("monthly wage = "+totalWage);
	}
}
