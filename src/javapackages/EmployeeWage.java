package javapackages;
import java.util.Random;
public class EmployeeWage {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10)+1;
        if(a%2==0){

            System.out.println("Employee is Present ");
        }
        else{
            System.out.println("Employee is absent");
        }

    }
}
