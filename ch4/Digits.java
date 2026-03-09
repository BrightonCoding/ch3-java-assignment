/* 
Author Brighton Ng
March 6th, 2025
Digits calculator
 */

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //gets user to input 3 digit number

        int Digit = scan.nextInt();

        int firstDigit = Digit / 100;
        int remainder = Digit % 100;
        int secondDigit = remainder / 10;
        int thirdDigit = remainder % 10;

        //output each digit separately
        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(thirdDigit);
    }
    
}