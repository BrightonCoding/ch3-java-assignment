/*
Brighton Ng
Apr 9 2026
Generates the repeating necklace sequence for each bead pair.
*/

package ch6;
import java.util.Scanner;

public class Necklace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int necklaceCount = scanner.nextInt();

        for (int i = 0; i < necklaceCount; i++) {
            int firstBead = scanner.nextInt() % 10;
            int secondBead = scanner.nextInt() % 10;

            StringBuilder pattern = new StringBuilder();
            pattern.append(firstBead).append(" ").append(secondBead);

            int previousBead = firstBead;
            int currentBead = secondBead;
            boolean[][] visited = new boolean[10][10];
            visited[previousBead][currentBead] = true;

            while (true) {
                int nextBead = (previousBead + currentBead) % 10;
                pattern.append(" ").append(nextBead);
                previousBead = currentBead;
                currentBead = nextBead;

                if (previousBead == firstBead && currentBead == secondBead) {
                    break;
                }

                if (visited[previousBead][currentBead]) {
                    break;
                }

                visited[previousBead][currentBead] = true;
            }

            System.out.println(pattern);
        }
    }
}
