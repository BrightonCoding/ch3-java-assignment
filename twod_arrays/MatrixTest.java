/*
 * Author: Brighton Ng
 * May 20, 2025
 */
package chapter10two;
import java.util.Scanner;

public class MatrixTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// read the size of the matrix
		int numRows = input.nextInt();
		int numCols = input.nextInt();

		// grid holds current values, maxEverGrid tracks the highest value ever at each spot
		int[][] grid = new int[numRows + 1][numCols + 1];
		int[][] maxEverGrid = new int[numRows + 1][numCols + 1];

		// fill in the starting values - index starts at 1 to match the problem's 1-based input
		for (int row = 1; row <= numRows; row++) {
			for (int col = 1; col <= numCols; col++) {
				grid[row][col] = input.nextInt();
				maxEverGrid[row][col] = grid[row][col]; // initial value counts as the max too
			}
		}

		int numQueries = input.nextInt(); // number of queries coming in

		for (int queryIndex = 0; queryIndex < numQueries; queryIndex++) {
			String operation = input.next();

			if (operation.equals("C")) {
				// change: update the value and check if it's a new max
				int row = input.nextInt();
				int col = input.nextInt();
				int newValue = input.nextInt();
				grid[row][col] = newValue;
				if (newValue > maxEverGrid[row][col]) {
					maxEverGrid[row][col] = newValue;
				}
			} else if (operation.equals("Q")) {
				// query: just print the current value
				int row = input.nextInt();
				int col = input.nextInt();
				System.out.println(grid[row][col]);
			} else if (operation.equals("M")) {
				// max: print the highest value that's ever been at this spot
				int row = input.nextInt();
				int col = input.nextInt();
				System.out.println(maxEverGrid[row][col]);
			}
		}
	}
}