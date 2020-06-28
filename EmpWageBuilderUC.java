public class EmpWageBuilderUC
{
	public static void main(String[] agrs)
	{
		System.out.println("calculate employee wage");
		//constants
		int totalWorkingHour = 100;
		int workingHour = 0;
		int is_present = 1;
		int empWage = 0;
		int wagePerHour = 20;
                byte fullDayHour = 8;
                byte halfDayHour = 4;
                int empWageFullfDay = 0;
		int empWageHalfDay = 0;
		int workingDays = 20;
		int totalWage = 0;
		int wage = 0;
		//Computation
		while(workingDays >= 0 && totalWorkingHour >= 0)
		{
			double workingTime = Math.floor(Math.random() * 10) % 3;
               		int day = (int) workingTime;
			switch(day)
               		{
                		case 0:
                        		empWageHalfDay = wagePerHour * halfDayHour;
					wage = wage + empWageHalfDay;
                        		System.out.println("employee half day");
                        		workingHour = halfDayHour;
					break;
               			case 1:
                        		empWageFullfDay = wagePerHour * fullDayHour;
                        		wage = wage + empWageFullfDay;
					workingHour = fullDayHour;
					System.out.println("employee full day");
                        		break;
                		default:
                        		System.out.println("employee wage absent");
                        		break;
			}
			totalWorkingHour = totalWorkingHour - workingHour;
			workingDays--;
			totalWage = totalWage + wage;
		}
		System.out.println("monthly wage = "+totalWage);
	}
}
