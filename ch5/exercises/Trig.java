/*
 * Brighton Ng
 * Mar 24
 * Calculates the sine, cosine, and tangent of an angle in degrees.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Trig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the angle measure in degrees.
        int degrees = scan.nextInt();

        // Convert the angle to radians before applying the trig functions.
        double sin = Math.sin(Math.toRadians(degrees));
        double cos = Math.cos(Math.toRadians(degrees));
        double tan = Math.tan(Math.toRadians(degrees));

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.printf("%s%n", df.format(sin));
        System.out.printf("%s%n", df.format(cos));
        System.out.printf("%s%n", df.format(tan));
    }
}
