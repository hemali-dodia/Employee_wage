import java.util.Scanner;

public class EmpWageBuilderUC
{
        public static byte FULL_DAY_HOUR = 8;
        public static byte HALF_DAY_HOUR = 4;

        public static int ComputeWage(String company_name, int wage_per_hour, int total_working_days, int total_working_hour)
        {	int empWage = 0; 
		int is_present = 1;
                int empWageFullDay = 0;
                int empWageHalfDay = 0;
                int totalWorkingDays = 0;
                int workingHour = 0;
                int totalWage = 0;
                int wage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;

		if (empCheck == is_present)
		{
			System.out.println("employee present");
	                while(workingHour <= total_working_hour && totalWorkingDays <= total_working_days)
        	        {
                	        if(EmpAttendance()==1)
                        	{
                        	        int part_full_time = EmpTime();
                        	        switch(part_full_time)
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
                        	}
                        	totalWorkingDays++;
                        	totalWage = totalWage + wage;
                	}

                	System.out.println("for company "+company_name+"monthly wage = "+totalWage);
		}
		else
		{

			empWage = 0;
			System.out.println("absent, emp wage - "+empWage);
		}
		return totalWage;
        }

        public static int EmpAttendance()
        {
                double ckeckAttend = Math.floor(Math.random() * 10) % 2;
                int attendance = (int) ckeckAttend;
                return(attendance);
        }

        public static int EmpTime()
        {
                double checkHours = Math.floor(Math.random() * 10) % 2;
                int workingHours = (int) checkHours;
                return(workingHours);
        }

        public static void main(String[] args)
        {
                ComputeWage("Dmart", 25,30,10);
                ComputeWage("TCS",30,20,8);
        }
}

