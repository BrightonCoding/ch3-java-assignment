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

		// salesman's starting position
		int currentX = input.nextInt();
		int currentY = input.nextInt();

		int numCities = input.nextInt(); // how many cities are on the grid

		// coinMap[x][y] stores how many coins are at that position
		// way faster than looping through all cities every move - just look up the spot directly
		// max coordinate is 1000 so 1001x1001 covers everything
		int[][] coinMap = new int[1001][1001];

		// read in each city and store its coins at the right coordinate
		for (int cityIndex = 0; cityIndex < numCities; cityIndex++) {
			int cityX = input.nextInt();
			int cityY = input.nextInt();
			int coinsAtCity = input.nextInt();
			coinMap[cityX][cityY] = coinsAtCity;
		}

		int numMoves = input.nextInt(); // number of moves the salesman makes

		int totalCoins = 0;

		// check if the salesman starts on a city
		totalCoins += coinMap[currentX][currentY];

		// process each move one at a time
		for (int moveIndex = 0; moveIndex < numMoves; moveIndex++) {
			String direction = input.next();
			// update position based on direction
			if (direction.equals("U")) {
				currentY--;
			} else if (direction.equals("D")) {
				currentY++;
			} else if (direction.equals("L")) {
				currentX--;
			} else if (direction.equals("R")) {
				currentX++;
			}

			// just look up the new position in coinMap no loop needed
			totalCoins += coinMap[currentX][currentY];
		}

		System.out.println(totalCoins);
	}
}