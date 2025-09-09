package basic_java;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int i;
        int ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for( i=1; i<=10; i++){
            ans=num*i;
            System.out.println(num+ "*"+i+"="+ans);
            sc.close();
       }
    }
}
