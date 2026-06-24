package chapter7;

/*
 * Name: Brighton Ng
 * Date: April 29, 2026
 * Program: PerfectIntegers.java
 * Description: Displays all perfect integers up to 100.
 *              A perfect integer equals the sum of its factors (excluding itself).
 */

public class PerfInt {

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