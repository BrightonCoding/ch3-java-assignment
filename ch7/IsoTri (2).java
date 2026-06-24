package ch7;

/*
 * Brighton
 * April 29, 2026
 * IsoTriangle.java
 * Prompts the user for a size and displays an isosceles triangle of that many lines.
 */

import java.util.Scanner;

public class IsoTri {

    /**
     * Prints a specified number of spaces.
     * pre: num is non-negative
     * post: num spaces printed on the same line
     */
    public static void addSpaces(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(" ");
        }
    }

    /**
     * Draws a bar of asterisks and moves to the next line.
     * pre: length is positive
     * post: a bar of length asterisks is displayed
     */
    public static void drawBar(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = input.nextInt();

        // row i gets (size - i) spaces and (2*i - 1) stars to keep the triangle centered
        for (int i = 1; i <= size; i++) {
            addSpaces(size - i);
            drawBar(2 * i - 1);
        }
    }
}