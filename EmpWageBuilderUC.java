public class EmpWageBuilderUC
{
	private final String Compny_name;
	private final int Wage_Per_Hour;
	private final int Full_Day_Hour;
	private final int Half_Day_Hour;
	private final int Total_Working_Days;
        private final int Total_Working_Hour;

	public static EmpWageForDiffCompany(String Compny_name, int Wage_Per_Hour, int Full_Day_Hour, int Half_Day_Hour, int Total_Working_Days, int Total_Working_Hour)
	{
		this.Compny_name = Compny_name;
		this.Wage_Per_Hour = Wage_Per_Hour;
		this.Full_Day_Hour = Full_Day_Hour;
		this.Half_Day_Hour = Half_Day_Hour;
		this.Total_Working_Days = Total_Working_Days;
		this.Total_Working_Hour = Total_Working_Hour;
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
		EmpWageBuilderUC8 company_1 = new EmpWageBuilderUC8("company_1", 20, 8, 4, 20, 100);

		int EmpWageFullDay = 0;
		int EmpWageHalfDay = 0;
		int totalWorkingDays = 0;
		int WorkingHour = 0;
		int totalWage = 0;
		int Wage = 0;

		while(WorkingHour <= company_1.Total_Working_Hour && totalWorkingDays <= company_1.Total_Working_Days)
		{
			if(EmpAttendance()==1)
			{
				int Part_Full_time = EmpTime();
				switch(Part_Full_time)
				{
					case 0:
						EmpWageHalfDay = EmpWage(company_1.Half_Day_Hour);
						Wage = Wage + EmpWageHalfDay;
        	        			WorkingHour = WorkingHour + company_1.Half_Day_Hour;
						break;
        				case 1:
						EmpWageFullDay = EmpWage(company_1.Full_Day_Hour);
						Wage = Wage + EmpWageFullDay;
        	        			WorkingHour = WorkingHour + company_1.Full_Day_Hour;
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

