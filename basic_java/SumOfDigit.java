package basic_java;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int last_digit;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while(num!=0){
            last_digit = num % 10;
            sum +=last_digit ;
            num = num / 10;
     }

     
       System.out.println ("Sum of digits : " + sum);
       sc.close();
    }
}
