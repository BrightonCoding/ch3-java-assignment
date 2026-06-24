/*
 * StudentRoster.java
 * Author: Brighton Ng
 * Date: May 1, 2026
 * Description: Prompts the user for student names, stores them
 *              in an array, then prints the list and reverse list.
 */

package chapter10;

import java.util.Scanner;

public class StudentRoster {

    public static void printList(String[] names) {
        System.out.print("[");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            if (i < names.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printReverse(String[] names) {
        System.out.print("[");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students? ");
        int numStudents = input.nextInt();
        input.nextLine(); // clears the leftover newline so nextLine() works after nextInt()

        String[] roster = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            roster[i] = input.nextLine();
        }

        System.out.println("\nStudent Roster");
        printList(roster);

        System.out.println("\nReverse Order");
        printReverse(roster);
    }
}