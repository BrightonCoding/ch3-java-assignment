package ch6;
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;

        while (n > 0) {
            int digit = n % 10; // get last digit
            sum += digit;       // add to sum
            n = n / 10;         // remove last digit
        }

        System.out.println(sum);
    }
}