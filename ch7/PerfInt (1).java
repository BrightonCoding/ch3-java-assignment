package ch7;

/*
 * Brighton
 * April 29, 2026
 * PerfectIntegers.java
 * Displays all perfect integers up to 100.
 * A perfect integer equals the sum of its factors (excluding itself).
 */

public class PerfInt {

    /**
     * Determines if a number is a perfect integer.
     * pre: num is a positive integer
     * post: returns true if the sum of factors (excluding num) equals num, false otherwise
     */
    public static boolean isPerfect(int num) {
        int sum = 0;
        // i < num so we never include the number itself as a factor
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}