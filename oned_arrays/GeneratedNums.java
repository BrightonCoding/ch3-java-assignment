/*
 * GeneratedNums
 * Brighton
 * Generates a number for each array element by summing
 *              the index and its individual digits. Uses 101 elements.
 *              Example: index 17 -> 17 + 1 + 7 = 25
 */

package oned_arrays;

public class GeneratedNums {

    /**
     * Calculates the sum of all individual digits of a given integer.
     * Precondition:  num is a non-negative integer.
     * Postcondition: Returns the sum of each digit in num.
     */
    public static int digitSum(int num) {
        int sum = 0;
        // % 10 peels off the last digit, / 10 drops it — repeat until nothing left
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] generated = new int[101];

        for (int i = 0; i < generated.length; i++) {
            generated[i] = i + digitSum(i);
        }

        System.out.println("Index\tGenerated Number");
        for (int i = 0; i < generated.length; i++) {
            System.out.println(i + "\t" + generated[i]);
        }
    }
}