package week_1_java;
import java.util.Scanner;

class  DivOrLast{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if (num % 3 == 00 || num% 10 == 4) {
            System.out.println("Div by 3 or last dig is 4");
        } else {
            System.out.println("No criteria match");
        }
    }
}


    

