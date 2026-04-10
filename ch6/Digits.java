package ch6;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();

        for ( int i = 0; i < x.length(); i++) {
            System.out.println(x.charAt(i));
        }

    
    }
}