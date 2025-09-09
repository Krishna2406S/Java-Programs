package week_1_java;
import java.util.Scanner;
public class Average {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter Seconf number");
        int b = sc.nextInt();
        System.out.println("Enter Third number");
        int c = sc.nextInt();
        System.out.println("Enter Fourth number");
        int d = sc.nextInt();
        System.out.println("Enter Fifth number");
        int e = sc.nextInt();

        int sum = a+b+c+d+e;
        int avg = (sum/5);
        System.out.println("Average is:"+avg);


        

    }
    
}
