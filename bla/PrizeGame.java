package bla;
import java.util.*;

public class PrizeGame {
    public static void main(String[] args) {
        Random r = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a guess from 1 to 20: ");
        int guess = scanner.nextInt();

        int secret = r.nextInt(20) +1;

        System.out.println("Secret number: " + secret);

        System.out.println("Your guess: " + guess);

        int difference = secret - guess;

        System.out.println("Difference: " + Math.abs(difference));

        if (guess == secret) {
            System.out.print("Jackpot!");
        } else if (Math.abs(difference) <= 2) {
            System.out.print("So close!");
        } else {
            System.out.print("Try again.");
        }


    }
}
