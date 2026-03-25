/*
 * Brighton Ng
 * March 24, 2026
 * Prompts the user for a wave height and displays a surfing message.
 */

import java.util.Scanner;

public class Surfsup1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the wave height in feet: ");
        double waveHeight = input.nextDouble();

        if (waveHeight >= 6) {
            System.out.println("Great day for surfing!");
        }

        input.close();
    }
}
