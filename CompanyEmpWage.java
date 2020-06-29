interface ICompanyEmpWage
{
	void addCompanyEmpWage(String company_name, int wage_per_hour, int total_working_days, int total_working_hour);
	void computeWage();
	int computeWage(CompanyEmpWage CompanyEmpWage);
}

public class CompanyEmpWage
{

	public final int wage_per_hour;
	public final int total_working_days;
        public final int total_working_hour;
	public final String company_name;
	public	int totalWage = 0;

	public CompanyEmpWage(String company_name, int wage_per_hour, int total_working_days, int total_working_hour)
	{
		this.company_name = company_name;
		this.wage_per_hour = wage_per_hour;
		this.total_working_days = total_working_days;
		this.total_working_hour = total_working_hour;
	}

	public void setTotalWage(int totalWage)
	{
		this.totalWage = totalWage;
	}

	@Override
	public String toString(){
		return "total emp wage for company "+company_name+" is "+totalWage;
	}
}
