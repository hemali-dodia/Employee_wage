import java.util.Scanner;

public class EmpWageBuilderUC8
{
	public static int Wage_Per_Hour;
        public static byte Full_Day_Hour;
        public static byte Half_Day_Hour;
        public static int Total_Working_Days;
        public static int Total_Working_Hour;

	static void company()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter company id");
		int Company_ID = sc.nextInt();
		switch(Company_ID)
		{
			case 1:
				System.out.println("welcome to bridgelabz");
				Wage_Per_Hour = 20;
				Full_Day_Hour = 8;
				Half_Day_Hour = 4;
				Total_Working_Days = 25;
				Total_Working_Hour = 100;
				break;
			case 2:
				System.out.println("welcome to TCS");
                                Wage_Per_Hour = 25;
                                Full_Day_Hour = 9;
                                Half_Day_Hour = 5;
                                Total_Working_Days = 30;
                                Total_Working_Hour = 150;
                                break;
		}
	}

	public static int EmpAttendance()
	{
		double CkeckAttend = Math.floor(Math.random() * 10) % 2;
                int Attendance = (int) CkeckAttend;
		return(Attendance);
	}

	public static int EmpTime()
	{
		double CheckHours = Math.floor(Math.random() * 10) % 2;
		int WorkingHours = (int) CheckHours;
		return(WorkingHours);
	}

	public static int EmpWage(int WorkHour)
	{
		int salary = WorkHour * Wage_Per_Hour;
		return(salary);
	}

	public static void main(String[] args)
        {
		company();
		int EmpWageFullDay = 0;
		int EmpWageHalfDay = 0;
		int totalWorkingDays = 0;
		int WorkingHour = 0;
		int totalWage = 0;
		int Wage = 0;

		while(WorkingHour <= Total_Working_Hour && totalWorkingDays <= Total_Working_Days)
		{
			if(EmpAttendance()==1)
			{
				int Part_Full_time = EmpTime();
				switch(Part_Full_time)
				{
					case 0:
						EmpWageHalfDay = EmpWage(Half_Day_Hour);
						Wage = Wage + EmpWageHalfDay;
        	        			WorkingHour = WorkingHour + Half_Day_Hour;
						break;
        				case 1:
						EmpWageFullDay = EmpWage(Full_Day_Hour);
						Wage = Wage + EmpWageFullDay;
        	        			WorkingHour = WorkingHour + Full_Day_Hour;
						break;
					default:
						System.out.println("employee wage = 0");
						break;
				}
			}
			totalWorkingDays++;
			totalWage = totalWage + Wage;
		}
		System.out.println("monthly wage = "+totalWage);
	}
}


