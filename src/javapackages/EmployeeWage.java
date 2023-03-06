package javapackages;
import java.lang.Math;

public class EmployeeWage {
    public static void main(String[] args) {
        int wage_per_hour = 20;
        int full_day_hour = 8;
        int wage=0;
        for(int i=1;i<=20;i++) {
            double emp_rand1 =(int) Math.floor(Math.random() * 10) % 2;
            if (emp_rand1 == 1) {
                System.out.println("Employee is Present");
                int Dailywage = wage_per_hour * full_day_hour;
                wage=wage+Dailywage;
            } else {
                System.out.println("Employee is Absent");
            }
        }
        System.out.println("Total Monthly Wage of the employee is= "+wage);
            }
        }
