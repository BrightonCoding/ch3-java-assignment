/*
 * Brighton Ng
 * March 24, 2026
 * Determines whether a package should be accepted or rejected based on its dimensions.
 */

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the package length: ");
        double length = input.nextDouble();

        System.out.print("Enter the package width: ");
        double width = input.nextDouble();

        System.out.print("Enter the package height: ");
        double height = input.nextDouble();

        if (length > 10 || width > 10 || height > 10) {
            System.out.println("Reject");
        } else {
            System.out.println("Accept");
        }

        input.close();
    }
}
