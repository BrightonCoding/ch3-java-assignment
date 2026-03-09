/* 
Author Brighton Ng
March 6th, 2025
This is a program to calculate the energy of an object based on its mass
 */

 
import java.util.Scanner;

public class Energy {

    public static void main(String[] args) {
        final double c = 3e8; // speed of light in m/s
        final double JOULES = 360000; // energy used by one bulb in joules
    
        Scanner scan = new Scanner(System.in);
        double m = scan.nextDouble();
        double e = m * c * c;

        double bulbs = e / JOULES;

        long bulbsInt = Math.round(bulbs); // whole number of bulbs powered
        long eInt = Math.round(e);

        System.out.printf("%,d%n", eInt);
        System.out.printf("%,d%n", bulbsInt);
    }
    
}