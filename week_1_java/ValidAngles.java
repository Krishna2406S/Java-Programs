package week_1_java;
import java.util.Scanner;
public class ValidAngles {
    public static void main( String [] args){
       
        Scanner sc = new Scanner(System.in);      
        System.out.println("Enter first number");
        int angle1 = sc.nextInt();
        System.out.println("Enter second number");
        int angle2  = sc.nextInt();
        System.out.println("Enter third number");
        int angle3 = sc.nextInt();
        
        int sum = angle1+angle2+angle3;
        if (sum == 180){
            System.out.println("Triangle is valid.");
        }
        else{
            System.out.println("Triangle is not valid.");
        }

    }
}



