package javapackages;
import java.lang.Math;

public class EmployeeWage {
    private final String company;
    private final int numOfWorkingDays;
    private final int wage_per_hour;
    private int total_working_hour;
    private final int full_day_hour;
    private final int part_time_hour;

    public EmployeeWage(String company,int wage_per_hour,int full_day_hour,int part_time_hour,int numOfWorkingDays,int total_working_hour ){
        this.company=company;
        this.wage_per_hour = wage_per_hour;
        this.numOfWorkingDays=numOfWorkingDays;
        this.total_working_hour=total_working_hour;
        this.full_day_hour=full_day_hour;
        this.part_time_hour=part_time_hour;
    }

    public int employeeRandom(){
        double emp_random1 = Math.floor(Math.random() * 10) % 3;
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
    public int getNumOfWorkingDays(){
        return numOfWorkingDays;
    }
    public int getTotal_working_hour(){
        return total_working_hour;
    }
    public String getCompany(){
        return company;
    }

    public static void main(String[] args) {
        int month_days=0,total_working_hour=0,numOfWorkingDays=0,monthly_wage=0;
        EmployeeWage dMart=new EmployeeWage("DMart",20,8,10,20,4);
        int choice=dMart.employeeRandom();
        switch (choice) {
            case 1:
                while (numOfWorkingDays !=dMart.getNumOfWorkingDays() || total_working_hour != dMart.getTotal_working_hour()) {

                    int emp_random=dMart.employeeRandom();
                    month_days += 1;
                    switch (emp_random) {
                        case 1:
                            System.out.println("Employee is Present ");
                            monthly_wage=monthly_wage+dMart.dailyWageFullTime();
                            break;
                        case 2:
                            System.out.println("Employee is absent");
                            break;
                    }
                    if ((month_days == dMart.getNumOfWorkingDays()) || (total_working_hour == dMart.getTotal_working_hour())) {
                        break;
                    }
                }
                System.out.println("Monthly wage of Full time employee is: " +monthly_wage);
                break;
            case 2:
                while (month_days !=dMart.getNumOfWorkingDays() || total_working_hour != dMart.getTotal_working_hour()) {
                    int emp_random=dMart.employeeRandom();
                      month_days += 1;
                    switch (emp_random) {
                        case 1:
                            System.out.println("Part time Employee is Present ");
                            monthly_wage=monthly_wage+dMart.dailyWagePartTime();
                            break;
                        case 2:
                            System.out.println("Part time employee is absent");
                            break;
                    }
                    if (month_days == dMart.getNumOfWorkingDays()|| total_working_hour == dMart.getTotal_working_hour()) {
                        break;
                    }
                }
                System.out.println("Monthly wage of Part time employee is: " +monthly_wage);
                break;
            default: {
                System.out.println("Wrong Choice");
            }
        }
        System.out.println("Name of the company is:"+dMart.getCompany());
    }
}