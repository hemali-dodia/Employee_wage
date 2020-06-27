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
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == 1)
		{
			empWage = wagePerHour * 8;
                        System.out.println("employee wage = "+empWage);
			System.out.println("present full time");
		}
		else if (empCheck == 2)
		{
			empWageHalfDay = wagePerHour * 4;
                	System.out.println("employee wage = "+empWageHalfDay);
		}
		else
		{
			System.out.println("employee is absent ");
		}
	}
}
