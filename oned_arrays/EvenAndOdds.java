/*
 * EvensAndOdds.java
 * Author: Brighton Ng
 * Date: May 1, 2026
 * Description: Generates 25 random integers between 0 and 99,
 *              then displays evens on one line and odds on another.
 */

package chapter10;

import java.util.Random;

public class EvenAndOdds {

    public static void main(String[] args) {

        Random rand = new Random();

        // store all 25 first so we can loop through twice — once for odds, once for evens
        int[] numbers = new int[25];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("ODD:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();

        System.out.println("EVEN:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();
    }
}