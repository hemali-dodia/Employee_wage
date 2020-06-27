public class EmpWageBuilderUC
{
	public static void main(String[] agrs)
	{
		System.out.println("calculate employee wage");
		//constants
		int is_present = 1;
		int empWage = 0;
		int wagePerHour = 20;
                byte fullDayHour = 8;
                byte halfDayHour = 4;
                int empWageFullfDay = 0;
                int empWageHalfDay = 0;
                double workingTime = Math.floor(Math.random() * 10) % 2;
                int day = (int) workingTime;

		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == is_present)
		{
			System.out.println("present");
			switch(day)
                	{
                	case 0:
                        	empWageHalfDay = wagePerHour * halfDayHour;
                        	System.out.println("employee wage = "+empWageHalfDay);
                        	break;
               		case 1:
                        	empWageFullfDay = wagePerHour * fullDayHour;
                        	System.out.println("employee wage = "+empWageFullfDay);
                        	break;
                	default:
                        	System.out.println("employee wage = 0");
                        	break;
			}
		}
		else
		{

			empWage = 0;
			System.out.println("absent, emp wage - "+empWage);
		}

	}
}
