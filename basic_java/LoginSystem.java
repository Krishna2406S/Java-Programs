package basic_java;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        int password;
        boolean accessGranted = false ;
        int i=1;
        Scanner sc=new Scanner(System.in);
        while(i<=3){
            System.out.print("Enter your password: ");
            password = sc.nextInt();
            if (password == 4545){
                
                accessGranted = true;
                break;
            }
            i++;
        }
    if ( accessGranted){
        System.out.println("Access Granted for using your system");

    }
    else{
        System.out.println("System locked");
    }
    }
}
