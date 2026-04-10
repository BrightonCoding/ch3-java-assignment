/*
Brighton Ng
Apr 9 2026
Calculates how many years an investment takes to reach a target amount.
*/

package ch6;
import java.util.*;


public class Investment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double z = scanner.nextDouble();
        double y = scanner.nextDouble();

        int years = 0;

        while (x<z) {
            x = x * (1+(y/100));
            years ++;
        }

        System.out.print(years);


    }
}
