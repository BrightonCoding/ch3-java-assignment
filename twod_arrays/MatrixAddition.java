
/*
 * MatricesAddition application
 * Brighton Ng
 * Prompts user for two matrices, adds them, and displays the result.
 */
package chapter10two;


import java.util.Scanner;

public class MatrixAddition {
	// static so all methods can use the same scanner
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// get the dimensions first before anything else
		System.out.print("Enter the number of rows: ");
		int numRows = input.nextInt();
		System.out.print("Enter the number of columns: ");
		int numCols = input.nextInt();

		// fill in both matrices
		System.out.println("\nEnter Matrix 1:");
		int[][] firstMatrix = getMatrix(numRows, numCols);

		System.out.println("\nEnter Matrix 2:");
		int[][] secondMatrix = getMatrix(numRows, numCols);

		// add them together
		int[][] resultMatrix = addMatrices(firstMatrix, secondMatrix);

		// print everything out so we can see the work
		System.out.println("\nMatrix 1:");
		showMatrix(firstMatrix);

		System.out.println("\nMatrix 2:");
		showMatrix(secondMatrix);

		System.out.println("\nResult:");
		showMatrix(resultMatrix);
	}

	/**
	 * Prompts the user to input each element of the matrix
	 * pre: numRows and numCols define the dimensions
	 * post: returns a filled 2D array
	 */
	public static int[][] getMatrix(int numRows, int numCols) {
		int[][] matrix = new int[numRows][numCols];
		// go row by row, column by column and ask for each number
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numCols; col++) {
				System.out.print("Element [" + row + "][" + col + "]: ");
				matrix[row][col] = input.nextInt();
			}
		}
		return matrix;
	}

	/**
	 * Displays all elements of the matrix
	 * pre: a valid 2D array
	 * post: prints the matrix to console
	 */
	public static void showMatrix(int[][] matrix) {
		// print each row on its own line
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Adds two matrices element by element
	 * pre: two 2D arrays of the same dimensions
	 * post: returns a new 2D array which is their sum
	 */
	public static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix) {
		int[][] resultMatrix = new int[firstMatrix.length][firstMatrix[0].length];
		// add matching elements together and store in result
		for (int row = 0; row < firstMatrix.length; row++) {
			for (int col = 0; col < firstMatrix[row].length; col++) {
				resultMatrix[row][col] = firstMatrix[row][col] + secondMatrix[row][col];
			}
		}
		return resultMatrix;
	}
}