package ch6.activities;
import java.util.*;

public class Prompter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a min and max number: ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();  
        System.out.println("Please enter a number between " + min + " and " + max);      
        
        int number = scanner.nextInt();

        while (min > number || max < number) {
            System.out.println("Please enter a number between " + min + " and " + max);  
             number = scanner.nextInt();

        }

        System.out.print("The number is in range!");
        
        



    }
}
