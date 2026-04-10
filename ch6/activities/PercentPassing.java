package ch6.activities;
import java.util.*;

public class PercentPassing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int sum = 0;

        while (true) {
            System.out.println("Enter your score or enter 101 to get your percentage: ");
            int percentage = scanner.nextInt();

            if (percentage == 101) {
                double y = (double) score / sum * 100;
                System.out.println("Your percentage is " + y + "%");
                break;
            } else if (percentage > 70 && percentage <= 100) {
                score++;
                sum++;
            } else if (percentage >= 0 && percentage <= 70) {
                sum++;
            }
        }
    }
}