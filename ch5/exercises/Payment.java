/*
 * Brighton Ng
 * Mar 24
 * Calculates the monthly payment for a loan.
 */
import java.util.Scanner;

public class Payment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Read the principal, annual interest rate, and number of payments.
        double p = scan.nextDouble();
        double r = scan.nextDouble();
        double m = scan.nextDouble();

        // Use the loan payment formula to compute the monthly payment amount.
        double result = (p * (r / 12)) / (1 - Math.pow(1 + r / 12, -m));

        System.out.printf("%.2f", result);
    }
}
