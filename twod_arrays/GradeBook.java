/*
 * GradeBook java application
 * Brighton Ng
 * Reads data from a file so you don't need to type it.
 */

package 2d_arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradeBook {
	private static Scanner input;

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("grades.txt");
		input = new Scanner(file);

		final int NUM_STUDENTS = input.nextInt();
		final int NUM_TESTS = input.nextInt();

		int[][] testScores = new int[NUM_STUDENTS][NUM_TESTS];
		double[] avgPerStudent = new double[NUM_STUDENTS];
		double[] avgPerTest = new double[NUM_TESTS];
		String[] studentNames = new String[NUM_STUDENTS];

		for (int studentIndex = 0; studentIndex < NUM_STUDENTS; studentIndex++)
			studentNames[studentIndex] = input.next();

		for (int studentIndex = 0; studentIndex < testScores.length; studentIndex++) {
			for (int testIndex = 0; testIndex < testScores[studentIndex].length; testIndex++)
				testScores[studentIndex][testIndex] = input.nextInt();
		}

		System.out.println("These are the grades for the class: \n");
		showGrades(testScores, studentNames);

		System.out.println("\nStudent Averages:");
		for (int studentIndex = 0; studentIndex < NUM_STUDENTS; studentIndex++) {
			avgPerStudent[studentIndex] = studentAvg(testScores, studentIndex);
			System.out.printf("%s average: %.1f%n",
					studentNames[studentIndex],
					avgPerStudent[studentIndex]);
		}

		System.out.println("\nTest Averages:");
		for (int testIndex = 0; testIndex < NUM_TESTS; testIndex++) {
			avgPerTest[testIndex] = testAvg(testScores, testIndex);
			System.out.printf("Test %d average: %.1f%n",
					(testIndex + 1),
					avgPerTest[testIndex]);
		}
	}

	public static void showGrades(int[][] testScores, String[] studentNames) {
		for (int studentIndex = 0; studentIndex < testScores.length; studentIndex++) {
			System.out.print(studentNames[studentIndex] + ": ");

			for (int testIndex = 0; testIndex < testScores[studentIndex].length; testIndex++) {
				System.out.print(testScores[studentIndex][testIndex] + " ");
			}

			System.out.println();
		}
	}

	public static double studentAvg(int[][] testScores, int studentNum) {
		int totalScore = 0;

		for (int testIndex = 0; testIndex < testScores[studentNum].length; testIndex++) {
			totalScore += testScores[studentNum][testIndex];
		}

		// cast so the division doesn't truncate to an int
		return (double) totalScore / testScores[studentNum].length;
	}

	public static double testAvg(int[][] testScores, int testNum) {
		int totalScore = 0;

		for (int studentIndex = 0; studentIndex < testScores.length; studentIndex++) {
			totalScore += testScores[studentIndex][testNum];
		}

		return (double) totalScore / testScores.length;
	}
}