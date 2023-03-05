package javapackages;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args){
        Random random = new Random();
        int a = random.nextInt(10)+1;
        int wage_per_hour=20;
        int full_day_hour=8;
        if(a%2==0){
            System.out.println("Employee is Present ");
            int daily_wage = wage_per_hour*full_day_hour;
            System.out.println("Daily wage of the employee is: "+daily_wage+" Rupees");
        }
        else{
            System.out.println("Employee is absent");
            System.out.println("Daily wage of the employee is: 0 Rupees");
        }
    }
}
