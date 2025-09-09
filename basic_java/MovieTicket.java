package basic_java;
import java.util.Scanner;
public class MovieTicket {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the age: ");
       int age = sc.nextInt();
       System.out.print("Do you have a membership card? (Yes/No): ");
       String membership = sc.next();
       int price = 0;
       if (age < 12){
        price = 5;
       }
       else if (age >=65){
        price = 7;
       }
       else{
        price = 10;
       }
    if (membership.equals("yes")){
        price -= 2;
    }
    System.out.println("Ticket price is: $"+price);
    
    sc.close();
}
}
