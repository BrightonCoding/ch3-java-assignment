/*
 * Brighton Ng
 * March 24, 2026
 * Calculates a circle's circumference or reports an illegal negative radius.
 */

import java.util.Scanner;

public class CircleCircumference2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        if (radius < 0) {
            System.out.println("Negative radii are illegal.");
        } else {
            double circumference = 2 * Math.PI * radius;
            System.out.println("Circumference: " + circumference);
        }

        input.close();
    }
}
