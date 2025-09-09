package week_1_java;
import java.util.Scanner;
public class DivBy7 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if (num % 7 == 0){
            System.out.println("It is divisible by 7");
        }
        else{
            System.out.println("Not divisible.");
        }
        
    }
}

