/*
 * Brighton Ng
 * March 24, 2026
 * Prompts the user for a wave height and recommends surfing or body boarding.
 */

import java.util.Scanner;

public class Surfsup2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the wave height in feet: ");
        double waveHeight = input.nextDouble();

        if (waveHeight >= 6) {
            System.out.println("Great day for surfing!");
        } else {
            System.out.println("Go body boarding!");
        }

        input.close();
    }
}
