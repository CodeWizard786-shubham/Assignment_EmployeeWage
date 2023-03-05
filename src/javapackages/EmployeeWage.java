package javapackages;
import java.util.Scanner;
import java.lang.Math;

public class EmployeeWage {
    public static void main(String args[]){
        double emp_rand=Math.floor(Math.random()*10)%2;
        Scanner sc =new Scanner(System.in);
        int wage_per_hour=20;
        int full_day_hour=8;
        int part_time_hour=8;
        System.out.println("Enter 1 if you are a full time Employee\nEnter 2 if you are Part time Employee ");
        int choice = sc.nextInt();
        if(choice==1) {
            if (emp_rand == 1) {
                System.out.println("Employee is Present ");
                int daily_wage = wage_per_hour * full_day_hour;
                System.out.println("Daily wage of the employee is: " + daily_wage + " Rupees");
            } else {
                System.out.println("Employee is absent");
                System.out.println("Daily wage of the employee is: 0 Rupees");
            }
        }
        else if(choice==2){
            if(emp_rand==0){
                System.out.println("Part time Employee is Present ");
                int daily_wage_partTime = part_time_hour * wage_per_hour;
                System.out.println("Daily wage of the employee is: " + daily_wage_partTime+ " Rupees");

            }
            else{
                System.out.println("Part time employee is absent");
            }
        }
        else{
            System.out.println("Wrong Choice");
        }
    }
}

