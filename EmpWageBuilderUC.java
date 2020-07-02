import java.util.ArrayList;
import java.util.*;
interface ICompanyEmpWage
{
        void addCompanyEmpWage(String company_name, int wage_per_hour, int total_working_days, int total_working_hour);
        void computeWage();
        int computeWage(CompanyEmpWage CompanyEmpWage);
}


class Test implements ICompanyEmpWage
{
	public static byte FULL_DAY_HOUR = 8;
        public static byte HALF_DAY_HOUR = 4;
	ArrayList dailyWage = new ArrayList();
	public int totalWage = 0;

	CompanyEmpWage comEmp = new CompanyEmpWage(company_name, wage_per_hour, total_working_days, total_working_hour);

	public ArrayList<CompanyEmpWage> comEmpArray = new ArrayList<CompanyEmpWage>();

	public void addCompanyEmpWage(String company_name, int wage_per_hour, int total_working_days, int total_working_hour)
	{
		comEmpArray.add(CompanyEmpWage(comEmp));
	}

	public void computeWage()
        {
		Iterator<CompanyEmpWage> it = comEmpArray.iterator();
		while(it.hasNext())
		{
			CompanyEmpWage ce = it.next();
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
				dailyWage.add(empWageHalfDay);
				break;
        		case 1:
				empWageFullDay = CompanyEmpWage.wage_per_hour * FULL_DAY_HOUR;
				wage = wage + empWageFullDay;
        	        	workingHour = workingHour + FULL_DAY_HOUR;
				dailyWage.add(empWageFullDay);
				break;
			default:
				dailyWage.add(0);
				System.out.println("employee is absent");
				break;
			}
			totalWorkingDays++;
			totalWage = totalWage + wage;
		}
		System.out.println("monthly wage = "+totalWage);
		return totalWage;
	}
}

public class EmpWageBuilderUC
{
	public static void main(String[] args)
	{
		Test t = new Test();

		t.addCompanyEmpWage("DMart",20,2,10);
		t.addCompanyEmpWage("tcs",25,20,20);
		t.computeWage();
	}
}
