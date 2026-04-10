/*
Brighton Ng
Apr 9 2026
Runs a guessing game until the user matches the generated number.
*/

package ch6;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Read the seed and the user's guess from input.

        int guess = 10000;
        int generated = 100000;

        while (generated != guess) {
            System.out.print("Enter a number between 1 and 20: ");

        guess = scan.nextInt();

        Random r = new Random();
        // Generate a predictable value from 1 to 20 using the provided seed.
        generated = r.nextInt(20) + 1;

 
        if (guess == generated) {
            System.out.println("You won!");
        } else {
            System.out.println("Try again.");
        }
    }
}
}
