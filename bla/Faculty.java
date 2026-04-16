package bla;
/*Brighton Ng
Mar 30 2026
Post-secondary program recommender
 */

import java.util.*;

public class Faculty {
    public static void main(String[] args) {
        //Set constants
        final int ARTS = 73;
        final int ENGINEERING = 89;
        final int SCIENCE = 81;  

        // Get input from student
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your average: ");
        int average = scanner.nextInt();

        // Generate result
        if ( average >= ENGINEERING ) {
            System.out.println("You could take: \nArts \nEngineering \nScience");
        } else if (average >= SCIENCE) {
            System.out.println("You could take: \nArts \nScience");           
        } else {
            System.out.println("You could take: \nArts");     
        }
    }
}
