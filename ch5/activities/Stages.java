/*
 * Brighton Ng
 * March 24, 2026
 * Prompts the user for an age and displays the life stage.
 */

import java.util.Scanner;

public class Stages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an age: ");
        int age = input.nextInt();

        if (age > 18) {
            System.out.println("adult");
        } else if (age <= 5) {
            System.out.println("toddler");
        } else if (age <= 10) {
            System.out.println("child");
        } else if (age <= 12) {
            System.out.println("preteen");
        } else {
            System.out.println("teen");
        }

        input.close();
    }
}
