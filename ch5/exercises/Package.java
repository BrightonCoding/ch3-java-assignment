/*
 * Brighton Ng
 * Mar 24
 * Determines whether a package passes the weight and size limits.
 */
import java.util.Scanner;

public class Package {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Read the package weight and dimensions.
        int weight = scan.nextInt();
        int l = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        // The package is checked against both the weight and volume limits.
        if (weight > 27 && l * w * h > 100000) {
            System.out.print("Too heavy and too large.");
        } else if (weight > 27) {
            System.out.print("Too heavy.");
        } else if (l * w * h > 100000) {
            System.out.print("Too large.");
        } else {
            System.out.print("Pass.");
        }
    }
}
