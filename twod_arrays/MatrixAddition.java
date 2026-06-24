
/*
 * MatricesAddition application
 * Brighton Ng
 * Prompts user for two matrices, adds them, and displays the result.
 */
package chapter10two;


import java.util.Scanner;

public class MatrixAddition {
	// static so all methods share the same scanner
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number of rows: ");
		int numRows = input.nextInt();
		System.out.print("Enter the number of columns: ");
		int numCols = input.nextInt();

		System.out.println("\nEnter Matrix 1:");
		int[][] firstMatrix = getMatrix(numRows, numCols);

		System.out.println("\nEnter Matrix 2:");
		int[][] secondMatrix = getMatrix(numRows, numCols);

		int[][] resultMatrix = addMatrices(firstMatrix, secondMatrix);

		System.out.println("\nMatrix 1:");
		showMatrix(firstMatrix);

		System.out.println("\nMatrix 2:");
		showMatrix(secondMatrix);

		System.out.println("\nResult:");
		showMatrix(resultMatrix);
	}

	public static int[][] getMatrix(int numRows, int numCols) {
		int[][] matrix = new int[numRows][numCols];
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numCols; col++) {
				System.out.print("Element [" + row + "][" + col + "]: ");
				matrix[row][col] = input.nextInt();
			}
		}
		return matrix;
	}

	public static void showMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix) {
		int[][] resultMatrix = new int[firstMatrix.length][firstMatrix[0].length];
		for (int row = 0; row < firstMatrix.length; row++) {
			for (int col = 0; col < firstMatrix[row].length; col++) {
				resultMatrix[row][col] = firstMatrix[row][col] + secondMatrix[row][col];
			}
		}
		return resultMatrix;
	}
}