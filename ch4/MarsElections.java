/*
Author Brighton Ng
March 6th, 2025
Mars Elections 
*/

import java.util.Scanner;

public class MarsElections {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int seats = scan.nextInt(); // total seats to distribute
        int n = scan.nextInt(); // number of parties

        int[] votes = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            votes[i] = scan.nextInt();
            total = total + votes[i];
        }

        int[] seatsWon = new int[n];
        double[] remainder = new double[n];
        int given = 0;

        for (int i = 0; i < n; i++) {
            double share = (double) votes[i] * seats / total;
            seatsWon[i] = (int) share;         
            remainder[i] = share - seatsWon[i]; 
            given = given + seatsWon[i];
        }

        int left = seats - given; // seats still to assign by largest remainder
        for (int r = 0; r < left; r++) {
            int best = 0;
            for (int i = 1; i < n; i++) {
                if (remainder[i] > remainder[best]) {
                    best = i;
                }
            }
            seatsWon[best]++;
            remainder[best] = -1;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(seatsWon[i]);
        }
    }
}
