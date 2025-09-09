package week_1_java;

import java.util.Scanner;

public class LastDig4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();


        if (num % 10 == 4) {
            System.out.println("The last digit is 4.");
        } else {
            System.out.println("The last digit is not 4.");
        }
    }

}
