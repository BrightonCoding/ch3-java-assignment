package ch6_strings;
import java.util.*;

public class Victor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] tokens = line.split(" ");

        double total = 0;
        int sign = 1;

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.equals("=")) {
                break;
            } else if (token.equals("+")) {
                sign = 1;
            } else if (token.equals("-")) {
                sign = -1;
            } else {
                total += sign * Double.parseDouble(token);
            }
        }

        System.out.printf("%.1f%n", total);
    }
}