package ch6;
import java.util.Scanner;

public class Ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        boolean allGold = true;
        for (int i = 0; i < n; i++) {
            int points = scanner.nextInt();
            int fouls = scanner.nextInt();
            int rating = 5 * points - 3 * fouls;
            if (rating > 40) {
                count++;
            } else {
                allGold = false;
            }
        }
        if (allGold) {
            System.out.println(count + "+");
        } else {
            System.out.println(count);
        }
    }
}