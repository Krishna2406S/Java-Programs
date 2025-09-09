package basic_java;
import java.util.Scanner;
public class EvenOdd {
    public static void main( String sh[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int num = sc.nextInt();
        if( num % 2 == 0){
            System.out.println("This is Even");
        } else {
            System.out.println("This is Odd");
        }
        sc.close();
    }

}
