package ch6.activities;
import java.util.*;


public class NumbersSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        
        for (int i=1; i<=n; i++) {
            if (i<=n) {
                System.out.println(i);
                sum = i + sum;
            }
        }
        
        System.out.print(sum);
        


    }
}