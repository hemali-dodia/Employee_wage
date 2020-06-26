public class EmpWageBuilderUC
{
        public static final byte Full_Day_Hour = 8;
        public static final byte Half_Day_Hour = 4;

        private final int Wage_Per_Hour;
        private final int Total_Working_Days;
        private final int Total_Working_Hour;
        private final String Company_name;

        public EmpWageBuilderUC(String Company_name, int Wage_Per_Hour, int Total_Working_Days, int Total_Working_Hour)
        {
                this.Company_name = Company_name;
                this.Wage_Per_Hour = Wage_Per_Hour;
                this.Total_Working_Days = Total_Working_Days;
                this.Total_Working_Hour = Total_Working_Hour;
        }

        public static void ComputeWage()
        {
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

        @Override
        public String toString(){
                return "total emp wage for company "+Company_name+" is "+totalWage;
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

