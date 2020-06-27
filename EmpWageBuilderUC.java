public class EmpWageBuilderUC
{
	public static void main(String[] agrs)
	{
		System.out.println("calculate employee wage");
		//constants
		int wagePerHour = 20;
                int fullDayHour = 1;
                int empWage = 0;
		int empWageHalfDay = 0;
		int is_present = 1;
		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == is_present)
		{
			System.out.println("present");
			double empCheckWorkHour = Math.floor(Math.random() * 10) % 2;
			if (empCheckWorkHour == fullDayHour)
			{
				empWage = wagePerHour * 8;
                		System.out.println("employee wage = "+empWage);
			}
			else
			{
				empWageHalfDay = wagePerHour * 4;
                		System.out.println("employee wage = "+empWageHalfDay);
			}
		}
		else
		{
			empWage = 0;
			System.out.println("employee is absent "+empWage);
		}
	}
}
