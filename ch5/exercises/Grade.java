/*
 * Brighton Ng
 * Mar 24
 * Converts a percentage grade into an achievement level.
 */
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Read the student's percentage grade.
        int grade = scan.nextInt();

        // Achievement levels are assigned by checking the highest matching threshold first.
        if (grade >= 80) {
            System.out.print("Level 4");
        } else if (grade >= 70) {
            System.out.print("Level 3");
        } else if (grade >= 60) {
            System.out.print("Level 2");
        } else if (grade >= 50) {
            System.out.print("Level 1");
        } else {
            System.out.print("Level R");
        }
    }
}
