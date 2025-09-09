package basic_java;
import java.util.Scanner;
public class TimeMsg {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hour (0-23): ");
        int hour = sc.nextInt();
        if (hour >= 0 && hour < 12) {
            System.out.println("Good Morning");
        } 
        else if (hour >= 12 && hour < 18) {
            System.out.println("Good Afternoon");
        } 
        else if (hour >= 18 && hour < 24) {
            System.out.println("Good Evening");
        } 
        else {
            System.out.println("Time is out of range");
        }

        sc.close();
    }
}
