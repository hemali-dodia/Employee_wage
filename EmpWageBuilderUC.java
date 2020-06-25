public class EmpWageBuilderUC
{
	public static void main(String[] agrs)
	{
		System.out.println("calculate employee wage");
		//constants
		int IS_FULL_TIME = 1;
		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("present");
		else
			System.out.println("absent");

		int WagePerHour = 20;
		int FullDayHour = 8;
		int EmpWage = 0;
		EmpWage = WagePerHour * FullDayHour;
		System.out.println("employee wage = "+EmpWage);

		int HalfDayHour = 4;
                int EmpWage = 0;
		EmpWageHalfDay = WagePerHour * HalfDayHour;
                System.out.println("employee wage = "+EmpWageHalfDay);
	}
}
