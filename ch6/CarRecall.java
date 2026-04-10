/*
Brighton Ng
Apr 9 2026
Determines whether a car model is included in the recall list.
*/
package ch6;
import java.util.Scanner;

public class CarRecall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Read the car model number to evaluate.
        int car = 1;
        while (car != 0) {
        System.out.println("Enter the car's model number or 0 to quit: ");
        car = scan.nextInt();

        // Unsafe models are listed explicitly, including the recalled range 189 to 198.

            if (car == 119 || car == 179 || car == 221 || car == 780 || (car >= 189 && car <= 198)) {
            System.out.println("NOT Safe.");
        } else {
            System.out.println("Safe.");
        }
    }
    }
}
