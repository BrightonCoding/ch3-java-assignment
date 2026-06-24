/*
 * GeneratedNums.java
 * Author: Brighton Ng
 * Date: May 1, 2026
 * Description: Generates a number for each array element by summing
 *              the index and its individual digits. Uses 101 elements.
 *              Example: index 17 -> 17 + 1 + 7 = 25
 */

package chapter10;

public class GeneratedNums {

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