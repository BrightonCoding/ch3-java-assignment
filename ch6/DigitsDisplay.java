/*
Brighton Ng
Apr 9 2026
Displays each digit of the input number on a separate line.
*/

package ch6;
import java.util.Scanner;

public class DigitsDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();

        for ( int i = 0; i < x.length(); i++) {
            System.out.println(x.charAt(i));
        }

    
    }
}
