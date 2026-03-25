/*
 * Brighton Ng
 * March 24, 2026
 * Determines the number of roots of a quadratic equation using the discriminant.
 */

import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value for c: ");
        double c = input.nextDouble();

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant < 0) {
            System.out.println("No roots");
        } else if (discriminant == 0) {
            System.out.println("One root");
        } else {
            System.out.println("Two roots");
        }

        input.close();
    }
}
