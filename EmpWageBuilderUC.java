public class EmpWageBuilderUC
{
	public static byte FULL_DAY_HOUR = 8;
        public static byte HALF_DAY_HOUR = 4;

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

	public void addCompanyEmpWage(String company_name, int wage_per_hour, int total_working_days, int total_working_hour)
	{
<<<<<<< HEAD
<<<<<<< HEAD
		comEmpArray(numOfCompany) = new CompanyEmpWage(Company_name, Wage_Per_Hour, Total_Working_Days, Total_Working_Hour);
=======
		comEmpArray[numOfCompany] = new CompanyEmpWage(Company_name, Wage_Per_Hour, Total_Working_Days, Total_Working_Hour);
>>>>>>> UC10
=======
		comEmpArray[numOfCompany] = new CompanyEmpWage(company_name, wage_per_hour, total_working_days, total_working_hour);
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
		int empWageFullDay = 0;
		int empWageHalfDay = 0;
		int totalWorkingDays = 0;
		int workingHour = 0;
		int wage = 0;

		while(workingHour <= CompanyEmpWage.total_working_hour && totalWorkingDays <= CompanyEmpWage.total_working_days)
		{
			double working_time = Math.floor(Math.random() * 10) % 3;
			int day = (int) working_time;
			switch(day)
			{
			case 0:
				empWageHalfDay = CompanyEmpWage.wage_per_hour * HALF_DAY_HOUR;
				wage = wage + empWageHalfDay;
        	        	workingHour = workingHour + HALF_DAY_HOUR;
				break;
        		case 1:
				empWageFullDay = CompanyEmpWage.wage_per_hour * FULL_DAY_HOUR;
				wage = wage + empWageFullDay;
        	        	workingHour = workingHour + FULL_DAY_HOUR;
				break;
			default:
				System.out.println("employee is absent");
				break;
			}
			totalWorkingDays++;
			totalWage = totalWage + wage;
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

