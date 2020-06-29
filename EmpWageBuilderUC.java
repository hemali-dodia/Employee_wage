public class EmpWageBuilderUC
{
        public final byte Full_Day_Hour = 8;
        public final byte Half_Day_Hour = 4;
	public int totalWage = 0;
	public int numOfCompany = 0;

	public CompanyEmpWage[] comEmpArray;

	public EmpWageBuilderUC()
	{
<<<<<<< HEAD
		CompanyEmpWage[] comEmpArray = new CompanyEmpWage[5];
=======
		comEmpArray = new CompanyEmpWage[5];
>>>>>>> UC10
	}

	public void addCompanyEmpWage(String Company_name, int Wage_Per_Hour, int Total_Working_Days, int Total_Working_Hour)
	{
<<<<<<< HEAD
		comEmpArray(numOfCompany) = new CompanyEmpWage(Company_name, Wage_Per_Hour, Total_Working_Days, Total_Working_Hour);
=======
		comEmpArray[numOfCompany] = new CompanyEmpWage(Company_name, Wage_Per_Hour, Total_Working_Days, Total_Working_Hour);
>>>>>>> UC10
		numOfCompany++;
	}

	public void computeWage()
        {
		for(int i=0; i<numOfCompany; i++)
		{
			comEmpArray[i].setTotalWage(this.computeWage(comEmpArray[i]));
			System.out.println(comEmpArray[i]);
		}
	}

	public int computeWage(CompanyEmpWage CompanyEmpWage)
	{
		int EmpWageFullDay = 0;
		int EmpWageHalfDay = 0;
		int totalWorkingDays = 0;
		int WorkingHour = 0;
		int Wage = 0;

		while(WorkingHour <= CompanyEmpWage.Total_Working_Hour && totalWorkingDays <= CompanyEmpWage.Total_Working_Days)
		{
			double WorkingTime = Math.floor(Math.random() * 10) % 2;
			int Day = (int) WorkingTime;
			switch(Day)
			{
			case 0:
				EmpWageHalfDay = CompanyEmpWage.Wage_Per_Hour * Half_Day_Hour;
				Wage = Wage + EmpWageHalfDay;
        	        	WorkingHour = WorkingHour + Half_Day_Hour;
				break;
        		case 1:
				EmpWageFullDay = CompanyEmpWage.Wage_Per_Hour * Full_Day_Hour;
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
<<<<<<< HEAD
		System.out.println("monthly wage = "+totalWage);
		return totalWage;
=======
	System.out.println("monthly wage = "+totalWage);
	return totalWage;
>>>>>>> UC10
	}

	public static void main(String[] args)
	{
		EmpWageBuilderUC empWage = new EmpWageBuilderUC();
		empWage.addCompanyEmpWage("DMart",20,2,10);
		empWage.addCompanyEmpWage("tcs",25,20,20);
		empWage.computeWage();
	}
}

