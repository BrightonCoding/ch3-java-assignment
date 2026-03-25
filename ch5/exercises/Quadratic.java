/*
 * Brighton Ng
 * Mar 24
 * Finds the real roots of a quadratic equation.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Read the coefficients of the quadratic equation.
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        DecimalFormat df = new DecimalFormat("0.##");

        // A negative discriminant means the equation has no real roots.
        if (b * b - 4 * a * c < 0) {
            System.out.print("No real roots.");
        } else if (x1 == x2) {
                System.out.print("One real root.");
        } else if (x1 != x2) {
            System.out.printf("%s%n", df.format(x1));
            System.out.printf("%s%n", df.format(x2));
        }
    }
}
