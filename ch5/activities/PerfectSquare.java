/*
 * Brighton Ng
 * March 24, 2026
 * Determines whether an entered integer is a perfect square.
 */

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println(number + " is not a perfect square.");
        } else {
            int root = (int) Math.sqrt(number);
            int square = root * root;

            if (square == number) {
                System.out.println(number + " is a perfect square.");
            } else {
                System.out.println(number + " is not a perfect square.");
            }
        }

        input.close();
    }
}
