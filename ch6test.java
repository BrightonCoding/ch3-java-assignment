/*
Brighton Ng
Apr 13 2026
Random number guessing game
 */

import java.util.*;

public class ch6test {
    public static void main(String[] args) {
        //Settng constants and random numbers
        final int MAXIMUM = 10;
        Random r = new Random();
        int answer = r.nextInt(100)+1;
        int sum = 1;
        int guess = -1;

        System.out.println("Welcome to the guessing game!"); //Instructions
        System.out.println("I have selected a number from 1 to 100. Try to guess it!"); //Instructions
        System.out.println("You have a maximum number of " + MAXIMUM + " guesses."); //Instructions
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");

        // 5
        // 3,4,5

        // Start while loop
        while (guess != answer) {
 
            guess = scanner.nextInt();

            // Determine if guess equals to answer
            if (guess>answer) {
                System.out.println("Too high! Try again.");
                sum++;
            } else if (guess<answer) {
                System.out.println("Too low! Try again.");
                sum++;
            }
            
            // Determine if the user has reached the maximum number of guesses
            if (sum == MAXIMUM) {
                System.out.print("You've reached the maximum number of guesses.");
                break;
            }
        }
        
        if(guess == answer) {
            System.out.print("Correct! You guessed the number!");

        }

    }
}
