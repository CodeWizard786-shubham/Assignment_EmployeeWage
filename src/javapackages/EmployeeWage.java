package javapackages;
import java.lang.Math;

public class EmployeeWage {
    public static void main(String[] args) {
        int wage_per_hour = 20;
        int full_day_hour = 8;
        int wage = 0;
        int total_working_hour = 0;
        int month_days = 0;
        while (month_days != 20 || total_working_hour != 100) {
            double emp_rand1 = (int) Math.floor(Math.random() * 10) % 2;
            month_days += 1;
            if (emp_rand1 == 1) {
                System.out.println("Employee is Present");
                int Dailywage = wage_per_hour * full_day_hour;
                wage = wage + Dailywage;
                total_working_hour += 8;
            } else {
                System.out.println("Employee is Absent");
            }
            if (month_days == 20 || total_working_hour == 100) {
                break;
            }
        }
            System.out.println("Total Monthly Wage of the employee is = " + wage);
            System.out.println("Total Working hours of the Employee is = " +total_working_hour);

    }
            }
