/*
 * RandomStats.java
Brighton Ng
 * Generates 500 random numbers between 0 and 9,
 *              then displays the number of occurrences of each digit.
 */

package oned_arrays;

import java.util.Random;

public class RandomStats {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] count = new int[10];

        // the random number doubles as its own index, so no search needed
        for (int i = 0; i < 500; i++) {
            int num = rand.nextInt(10);
            count[num]++;
        }

        System.out.println("Number\tOccurrences");
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "\t" + count[i]);
        }
    }
}