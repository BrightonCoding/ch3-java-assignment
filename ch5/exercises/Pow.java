/*
 * Brighton Ng
 * Mar 24
 * Compares two ways of calculating a power.
 */
import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Read the base and exponent values.
        int x = scan.nextInt();
        int y = scan.nextInt();

        // Compare the logarithm-based calculation with Java's built-in power method.
        double result = Math.exp(y * Math.log(x));

        System.out.println(result);
        System.out.println(Math.pow(x, y));
    }
}
