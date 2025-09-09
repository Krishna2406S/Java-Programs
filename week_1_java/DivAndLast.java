package week_1_java;
import java.util.Scanner;
public class DivAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if (num % 3 == 00 && num% 10 == 4) {
            System.out.println("Div by 3 and last dig is 4");
        } else {
            System.out.println("Not");
        }
    }
}


