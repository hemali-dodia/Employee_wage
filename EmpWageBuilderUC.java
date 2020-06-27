public class EmpWageBuilderUC
{
	public static byte FULL_DAY_HOUR = 8;
        public static byte HALF_DAY_HOUR = 4;

        private final int wage_per_hour;
        private final int total_working_days;
        private final int total_working_hour;
        private final String company_name;
	private int totalWage = 0;

        public EmpWageBuilderUC(String company_name, int wage_per_hour, int total_working_days, int total_working_hour)
        {
                this.company_name = company_name;
                this.wage_per_hour = wage_per_hour;
                this.total_working_days = total_working_days;
                this.total_working_hour = total_working_hour;
        }

        public void ComputeWage()
        {
		int empWage = 0;
		int is_present = 1;
                int empWageFullDay = 0;
                int empWageHalfDay = 0;
                int totalWorkingDays = 0;
                int workingHour = 0;
                int wage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;

		if (empCheck == is_present)
		{
			System.out.println("employee present");

	                while(workingHour <= total_working_hour && totalWorkingDays <= total_working_days)
        	        {
                	        double workingTime = Math.floor(Math.random() * 10) % 2;
                	        int day = (int) workingTime;
                	        switch(day)
                	        {
                	        case 0:
                        	        empWageHalfDay = wage_per_hour * HALF_DAY_HOUR;
                        	        wage = wage + empWageHalfDay;
                        	        workingHour = workingHour + HALF_DAY_HOUR;
                        	        break;
                        	case 1:
                        	        empWageFullDay = wage_per_hour * FULL_DAY_HOUR;
                               		wage = wage + empWageFullDay;
                                	workingHour = workingHour + FULL_DAY_HOUR;
                                	break;
                        	default:
                                	System.out.println("employee wage = 0");
                                	break;
                        	}
                        	totalWorkingDays++;
                        	totalWage = totalWage + wage;
                	}
        		System.out.println("monthly wage = "+totalWage);
        	}
		else
		{

			empWage = 0;
			System.out.println("absent, emp wage - "+empWage);
		}
	}

        @Override
        public String toString(){
                return "total emp wage for company "+company_name+" is "+totalWage;
        }

        public static void main(String[] args)
        {
                EmpWageBuilderUC dMart = new EmpWageBuilderUC("dMart",20,30,100);
                EmpWageBuilderUC tcs = new EmpWageBuilderUC("TCS",25,25,150);
                dMart.ComputeWage();
                System.out.println(dMart);
                tcs.ComputeWage();
                System.out.println(dMart);
        }
}

