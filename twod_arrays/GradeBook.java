/*
 * GradeBook java application
 * Brighton Ng
 * Reads data from a file so you don't need to type it.
 */

// these imports are from the teacher's template
package 2d_arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradeBook {
	// grabbed this from the template
	private static Scanner input;

	// this too
	public static void main(String[] args) throws FileNotFoundException {
		//this too - reads the file instead of typing grades manually
		File file = new File("grades.txt");
		input = new Scanner(file);

		final int NUM_STUDENTS = input.nextInt();
		final int NUM_TESTS = input.nextInt();

		int[][] testScores = new int[NUM_STUDENTS][NUM_TESTS];
		double[] avgPerStudent = new double[NUM_STUDENTS];
		double[] avgPerTest = new double[NUM_TESTS];
		String[] studentNames = new String[NUM_STUDENTS];

		// this too
		for (int studentIndex = 0; studentIndex < NUM_STUDENTS; studentIndex++)
			studentNames[studentIndex] = input.next();

		// this too
		for (int studentIndex = 0; studentIndex < testScores.length; studentIndex++) {
			for (int testIndex = 0; testIndex < testScores[studentIndex].length; testIndex++)
				testScores[studentIndex][testIndex] = input.nextInt();
		}

		// show the full grade table first
		System.out.println("These are the grades for the class: \n");
		showGrades(testScores, studentNames);

		// loop through each student and print their average
		System.out.println("\nStudent Averages:");
		for (int studentIndex = 0; studentIndex < NUM_STUDENTS; studentIndex++) {
			avgPerStudent[studentIndex] = studentAvg(testScores, studentIndex);

			// changed to printf for 1 decimal place
			System.out.printf("%s average: %.1f%n",
					studentNames[studentIndex],
					avgPerStudent[studentIndex]);
		}

		// loop through each test and print the class average for that test
		System.out.println("\nTest Averages:");
		for (int testIndex = 0; testIndex < NUM_TESTS; testIndex++) {
			avgPerTest[testIndex] = testAvg(testScores, testIndex);

			// changed to printf for 1 decimal place
			System.out.printf("Test %d average: %.1f%n",
					(testIndex + 1),
					avgPerTest[testIndex]);
		}
	}

	/**
	 * First loop shows the grades for each student
	 * Second loop shows each test for the student
	 * pre: all the test scores
	 * post: print the grades
	 */
	public static void showGrades(int[][] testScores, String[] studentNames) {
		// go through each student one by one
		for (int studentIndex = 0; studentIndex < testScores.length; studentIndex++) {
			System.out.print(studentNames[studentIndex] + ": ");

			// print all their test scores on the same line
			for (int testIndex = 0; testIndex < testScores[studentIndex].length; testIndex++) {
				System.out.print(testScores[studentIndex][testIndex] + " ");
			}

			System.out.println();
		}
	}

	/**
	 * Calculates the average out of the five tests for each student
	 * pre: the test scores and the student number
	 * post: the average
	 */
	public static double studentAvg(int[][] testScores, int studentNum) {
		// add up all the scores for this student
		int totalScore = 0;

		for (int testIndex = 0; testIndex < testScores[studentNum].length; testIndex++) {
			totalScore += testScores[studentNum][testIndex];
		}

		// divide by number of tests to get the average
		return (double) totalScore / testScores[studentNum].length;
	}

	/**
	 * Calculates the average out of the twelve students for each test
	 * pre: the test scores and the test number
	 * post: the average
	 */
	public static double testAvg(int[][] testScores, int testNum) {
		// add up the same test score across all students
		int totalScore = 0;

		for (int studentIndex = 0; studentIndex < testScores.length; studentIndex++) {
			totalScore += testScores[studentIndex][testNum];
		}

		// divide by number of students to get the average
		return (double) totalScore / testScores.length;
	}
}