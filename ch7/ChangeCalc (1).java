package ch7;

/*
 * Brighton
 * April 29, 2026
 * ChangeCalculator.java
 * Calculates the total cent value of Anatoly's coins
 * (quarters, dimes, nickels, pennies) using a method.
 */

import java.util.Scanner;

public class ChangeCalc {

    /**
     * Calculates the total value of coins in cents.
     * pre: quarters, dimes, nickels, and pennies are non-negative integers
     * post: returns the total cent value of all coins combined
     */
    public static int getCents(int quarters, int dimes, int nickels, int pennies) {
        int total = (quarters * 25) + (dimes * 10) + (nickels * 5) + (pennies * 1);
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quarters = input.nextInt();
        int dimes = input.nextInt();
        int nickels = input.nextInt();
        int pennies = input.nextInt();

        int totalCents = getCents(quarters, dimes, nickels, pennies);

        System.out.println(totalCents);
    }
}