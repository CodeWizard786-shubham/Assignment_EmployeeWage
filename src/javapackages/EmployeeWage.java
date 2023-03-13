
package javapackages;
import java.util.Scanner;
import java.lang.Math;

public class EmployeeWage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wage_per_hour = 20;
        int full_day_hour = 8;
        int part_time_hour = 4;
        int monthly_wage=0;
        System.out.println("Enter 1 if you are a full time Employee\nEnter 2 if you are Part time Employee ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                for(int i=1;i<=20;i++) {
                    double emp_random1 = Math.floor(Math.random() * 10) % 2;
                    int emp_rand1 = (int) emp_random1;
                    switch (emp_rand1) {
                        case 1:
                            System.out.println("Employee is Present ");
                            int daily_wage = wage_per_hour * full_day_hour;
                            monthly_wage=monthly_wage+daily_wage;
                            System.out.println("Daily wage of the employee is: " + daily_wage + " Rupees");
                            break;
                        case 0:
                            System.out.println("Employee is absent");
                            break;
                    }
                }
                System.out.println("Monthly wage of Full time employee is: " + monthly_wage);
                break;
            case 2:
                for(int i=1;i<=20;i++) {
                    double emp_random2 = Math.floor(Math.random() * 10) % 2;
                    int emp_rand2 = (int) emp_random2;
                    switch (emp_rand2) {
                        case 1:
                            System.out.println("Part time Employee is Present ");
                            int daily_wage_partTime = part_time_hour * wage_per_hour;
                            monthly_wage=monthly_wage+daily_wage_partTime;
                            System.out.println("Daily wage of Part time employee is: " + daily_wage_partTime + " Rupees");
                            break;
                        case 0:
                            System.out.println("Part time employee is absent");
                            break;
                    }
                }
                System.out.println("Monthly wage of Part time employee is: " + monthly_wage);
                break;
            default: {
                System.out.println("Wrong Choice");
            }
        }
    }
}