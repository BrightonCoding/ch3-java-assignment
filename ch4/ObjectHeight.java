/* 
Author Brighton Ng
March 6th, 2025
THis is a program to calculate the height of an object dropped at any time
 */


import java.util.Scanner;

public class ObjectHeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double t = scan.nextDouble(); // time in seconds since drop
        double h = 100 - (4.9 * (t*t)); // height in meters above ground
        System.out.format("%.1f", h);
    }
    
}
