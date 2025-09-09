package basic_java;

import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        int A, B, C;
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the value of A");
        A = ab.nextInt();
        System.out.println("Enter the value of B");
        B = ab.nextInt();
        ab.close();
        C = A+B;
        System.out.println("The value of C is: "+C);
        
    }
}
