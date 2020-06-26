import java.util.Scanner;

public class EmpWageBuilderUC8
{
        public static byte Full_Day_Hour = 8;
        public static byte Half_Day_Hour = 4;

        public static int ComputeWage(String Company_Name, int Wage_Per_Hour, int Total_Working_Days, int Total_Working_Hour)
        {
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
                        }
                        totalWorkingDays++;
                        totalWage = totalWage + Wage;
                }
                System.out.println("for company "+Company_Name+"monthly wage = "+totalWage);

        return totalWage;

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

        public static void main(String[] args)
        {
                ComputeWage("Dmart", 25,30,10);
                ComputeWage("TCS",30,20,8);
        }
}

