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
		byte FullDayHour = 8;
		byte HalfDayHour = 4;
		int EmpWageFullfDay = 0;
		int EmpWageHalfDay = 0;
		double WorkingTime = Math.floor(Math.random() * 10) % 2;
		int Day = (int) WorkingTime;
		switch(Day)
		{
		case 0:
			EmpWageHalfDay = WagePerHour * HalfDayHour;
        	        System.out.println("employee wage = "+EmpWageHalfDay);
			break;
        	case 1:
			EmpWageFullfDay = WagePerHour * FullDayHour;
        	        System.out.println("employee wage = "+EmpWageFullfDay);
			break;
		default:
			System.out.println("employee wage = 0");
			break;
	}
}
