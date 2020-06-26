public class CompanyEmpWage
{
	public static final byte Full_Day_Hour = 8;
        public static final byte Half_Day_Hour = 4;

	public final int Wage_Per_Hour;
	public final int Total_Working_Days;
        public final int Total_Working_Hour;
	public final String Company_name;
	public	int totalWage = 0;

	public CompanyEmpWage(String Company_name, int Wage_Per_Hour, int Total_Working_Days, int Total_Working_Hour)
	{
		this.Company_name = Company_name;
		this.Wage_Per_Hour = Wage_Per_Hour;
		this.Total_Working_Days = Total_Working_Days;
		this.Total_Working_Hour = Total_Working_Hour;
	}

	public void setTotalWage(int totalWage)
	{
		this.totalWage = totalWage;
	}

	@Override
	public String toString(){
		return "total emp wage for company "+Company_name+" is "+totalWage;
	}
}
