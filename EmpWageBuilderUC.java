public class EmpWageBuilderUC
{
	public static final int Wage_Per_Hour = 20;
        public static final byte Full_Day_Hour = 8;
        public static final byte Half_Day_Hour = 4;
	public static final int Total_Working_Days = 20;
        public static final int Total_Working_Hour = 100;
        public static void main(String[] args)
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

		int EmpWageFullDay = 0;
		int EmpWageHalfDay = 0;
		int totalWorkingDays = 0;
		int WorkingHour = 0;
		int totalWage = 0;
		int Wage = 0;
		while(WorkingHour <= Total_Working_Hour && totalWorkingDays <= Total_Working_Days)
		{
			double WorkingTime = Math.floor(Math.random() * 10) % 2;
			int Day = (int) WorkingTime;
			switch(Day)
			{
			case 0:
				EmpWageHalfDay = Wage_Per_Hour * Half_Day_Hour;
				Wage = Wage + EmpWageHalfDay;
        	        	WorkingHour = WorkingHour + Half_Day_Hour;
				break;
        		case 1:
				EmpWageFullDay = Wage_Per_Hour * Full_Day_Hour;
				Wage = Wage + EmpWageFullDay;
        	        	WorkingHour = WorkingHour + Full_Day_Hour;
				break;
			default:
				System.out.println("employee wage = 0");
				break;
			}
			totalWorkingDays++;
			totalWage = totalWage + Wage;
		}
	System.out.println("monthly wage = "+totalWage);
	}
}

