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

		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 3;
		int empCheckFullPartAbsent = (int) empCheck;
		switch(empCheckFullPartAbsent)
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
                        	System.out.println("employee is absent");
                        	break;
		}
	}
}
