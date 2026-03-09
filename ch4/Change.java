/* 
Author Brighton Ng
March 6th, 2025
This is a program to calculate the number of each coin type to give as change
 */

 
import java.util.Scanner;

public class Change {

    public static void main(String[] args) {
        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;
        final int PENNY = 1;

        Scanner scan = new Scanner(System.in);
        int cents = scan.nextInt();
        
        // Highest denomination first
        int quarters = cents / QUARTER;
        int remaining = cents % QUARTER;
        
        int dimes = remaining / DIME;
        remaining = remaining % DIME;
        
        int nickels = remaining / NICKEL;
        remaining = remaining % NICKEL;
        
        int pennies = remaining;  // remaining is already in pennies
        
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
    
}