/*
Brighton Ng
Mar 13 2026
Apple pie calculator
*/

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of apple you have: ");
        int numApple = input.nextInt();

        int numPies = numApple / 4;
        int leftoverApple = numApple % 4;

        System.out.println("You can make " + numPies + " pies.");
        System.out.println("You have " + leftoverApple + " apple(s) left");
    }

}
