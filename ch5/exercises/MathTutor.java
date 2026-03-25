/*
 * Brighton Ng
 * Mar 24
 * Checks whether the user's guess matches a generated random number.
 */
import java.util.Random;
import java.util.Scanner;

public class MathTutor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Read the seed and the user's guess from input.
        int seed = scan.nextInt();
        int guess = scan.nextInt();

        Random r = new Random(seed);
        // Generate a predictable value from 1 to 20 using the provided seed.
        int generated = r.nextInt(20) + 1;

        if (guess == generated) {
            System.out.print("WINNER");
        } else {
            System.out.print("LOSER");
        }
    }
}
