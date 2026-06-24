/*
 * The Travelling Salesman
 * Brighton Ng
 * May 20, 2025
 */
package chapter10two;

import java.util.Scanner;

public class TravellingSalesman {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int currentX = input.nextInt();
		int currentY = input.nextInt();

		int numCities = input.nextInt();

		// store coins by coordinate so each lookup is O(1) instead of scanning all cities
		int[][] coinMap = new int[1001][1001];

		for (int cityIndex = 0; cityIndex < numCities; cityIndex++) {
			int cityX = input.nextInt();
			int cityY = input.nextInt();
			int coinsAtCity = input.nextInt();
			coinMap[cityX][cityY] = coinsAtCity;
		}

		int numMoves = input.nextInt();

		int totalCoins = 0;
		totalCoins += coinMap[currentX][currentY];

		for (int moveIndex = 0; moveIndex < numMoves; moveIndex++) {
			String direction = input.next();
			if (direction.equals("U")) {
				currentY--;
			} else if (direction.equals("D")) {
				currentY++;
			} else if (direction.equals("L")) {
				currentX--;
			} else if (direction.equals("R")) {
				currentX++;
			}

			totalCoins += coinMap[currentX][currentY];
		}

		System.out.println(totalCoins);
	}
}