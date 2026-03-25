/*
 * Brighton Ng
 * March 24, 2026
 * Prompts the user for a wave height and displays the best water activity.
 */

import java.util.Scanner;

public class Surfsup3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the wave height in feet: ");
        double waveHeight = input.nextDouble();

        if (waveHeight >= 6) {
            System.out.println("Great day for surfing!");
        } else if (waveHeight >= 3) {
            System.out.println("Go body boarding!");
        } else if (waveHeight >= 0) {
            System.out.println("Go for a swim.");
        } else {
            System.out.println("Whoa! What kind of surf is that?");
        }

        input.close();
    }
}
