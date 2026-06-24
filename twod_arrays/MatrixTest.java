/*
 * Author: Brighton Ng
 * May 20, 2025
 */
package chapter10two;
import java.util.Scanner;

public class MatrixTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numRows = input.nextInt();
		int numCols = input.nextInt();

		// +1 so we can use 1-based indexing to match the input format
		int[][] grid = new int[numRows + 1][numCols + 1];
		int[][] maxEverGrid = new int[numRows + 1][numCols + 1];

		for (int row = 1; row <= numRows; row++) {
			for (int col = 1; col <= numCols; col++) {
				grid[row][col] = input.nextInt();
				maxEverGrid[row][col] = grid[row][col];
			}
		}

		int numQueries = input.nextInt();

		for (int queryIndex = 0; queryIndex < numQueries; queryIndex++) {
			String operation = input.next();

			if (operation.equals("C")) {
				int row = input.nextInt();
				int col = input.nextInt();
				int newValue = input.nextInt();
				grid[row][col] = newValue;
				if (newValue > maxEverGrid[row][col]) {
					maxEverGrid[row][col] = newValue;
				}
			} else if (operation.equals("Q")) {
				int row = input.nextInt();
				int col = input.nextInt();
				System.out.println(grid[row][col]);
			} else if (operation.equals("M")) {
				int row = input.nextInt();
				int col = input.nextInt();
				System.out.println(maxEverGrid[row][col]);
			}
		}
	}
}