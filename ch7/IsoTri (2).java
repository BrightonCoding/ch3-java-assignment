package chapter7;

/*
 * Name: Brighton Ng
 * Date: April 29, 2026
 * Program: IsoTriangle.java
 * Description: Prompts the user for a size and displays
 *              an isosceles triangle of that many lines.
 */

import java.util.Scanner;

public class IsoTri {

    public static void addSpaces(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(" ");
        }
    }

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