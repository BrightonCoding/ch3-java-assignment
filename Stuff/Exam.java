/*
Brighton Ng
Mar 13 2026
Apple pie calculator
*/

import java.util.scanner;

public class Exam {
    public static void main(String[] args)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of apple you have: ");
        double numApple;
        numApple = input.nextInt;

        int numPies = numApple / 4;
        int leftoverApple = numApple % 4;

        System.out.printIn("You can make " + numPies + "pies.");
        System.out.print("You have " + leftoverApple + "apple(s) left");

}