package ch7;

/*
 * Brighton
 * April 29, 2026
 * HiLo.java
 */

import java.util.Scanner;
import java.util.Random;

public class HiLol {

    /**
     * Determines the result of the HiLo game.
     * pre: number is between 1 and 13, range is either "Hi" or "Lo"
     * post: returns 1 for a win, -1 for a loss, or 0 for a draw (7)
     */
    public static int getResult(int number, String range) {
        if (number == 7) {
            return 0;
        }

        if (range.equals("Lo")) {
            if (number >= 1 && number <= 6) {
                return 1;
            } else {
                return -1;
            }
        }

        if (number >= 8 && number <= 13) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long seed = input.nextLong();
        input.nextLine(); // clears the leftover newline so nextLine() reads the range correctly

        String range = input.nextLine();

        Random rand = new Random(seed);
        // +1 shifts the range from 0-12 to 1-13
        int number = rand.nextInt(13) + 1;

        int result = getResult(number, range);
        System.out.println(result);
    }
}