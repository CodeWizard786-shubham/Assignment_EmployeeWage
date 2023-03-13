package javapackages;
import java.util.Scanner;
import java.lang.Math;
class Employee {
    int wage_per_hour = 20;
    int full_day_hour = 8;
    int part_time_hour = 4;
    int monthly_wage = 0;
    int month_days = 0;
    int total_working_hour = 0;
    public int employeeRandom(){
        double emp_random1 = Math.floor(Math.random() * 10) % 2;
        int emp_rand1 = (int) emp_random1;
        return emp_rand1;
    }

    public int dailyWageFullTime() {
        int daily_wage =wage_per_hour * full_day_hour;
        total_working_hour += full_day_hour;
        return daily_wage;

    }
    public int dailyWagePartTime() {
        int daily_wage =wage_per_hour * part_time_hour;
        total_working_hour += full_day_hour;
        return daily_wage;

    }

}
public class EmployeeWage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1=new Employee();
        System.out.println("Enter 1 if you are a full time Employee\nEnter 2 if you are Part time Employee ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                while (e1.month_days != 20 || e1.total_working_hour != 100) {

                    int emp_random=e1.employeeRandom();
                    e1.month_days += 1;
                    switch (emp_random) {
                        case 1:
                            System.out.println("Employee is Present ");
                            e1.monthly_wage=e1.monthly_wage+e1.dailyWageFullTime();
                            break;
                        case 0:
                            System.out.println("Employee is absent");
                            break;
                    }
                    if (e1.month_days == 20 || e1.total_working_hour == 100) {
                        break;
                    }
                }
                System.out.println("Monthly wage of Full time employee is: " + e1.monthly_wage);
                break;
            case 2:
                while (e1.month_days != 20 || e1.total_working_hour != 100) {
                    int emp_random=e1.employeeRandom();
                    e1.month_days += 1;
                    switch (emp_random) {
                        case 1:
                            System.out.println("Part time Employee is Present ");
                            e1.monthly_wage=e1.monthly_wage+e1.dailyWagePartTime();
                            break;
                        case 0:
                            System.out.println("Part time employee is absent");
                            break;
                    }
                    if (e1.month_days == 20 || e1.total_working_hour == 100) {
                        break;
                    }
                }
                System.out.println("Monthly wage of Part time employee is: " + e1.monthly_wage);
                break;
            default: {
                System.out.println("Wrong Choice");
            }
        }
    }
}