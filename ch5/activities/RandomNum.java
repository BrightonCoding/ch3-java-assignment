/*
 * Brighton Ng
 * March 24, 2026
 * Prompts the user for a minimum and maximum value and displays a random integer.
 */

import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the minimum value: ");
        int min = input.nextInt();

        System.out.print("Enter the maximum value: ");
        int max = input.nextInt();

        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Random number: " + randomNumber);

        input.close();
    }
}
