package ch6_strings;
import java.util.*;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            String guess = scanner.nextLine();

            if (password.equals(guess)) {
                System.out.println("Access granted.");
                return;
            } else {
                System.out.println("Incorrect.");
            }
        }

        System.out.println("Access denied.");
    }
}