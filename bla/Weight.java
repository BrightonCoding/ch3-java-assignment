package bla;
/*
Brighton Ng
Mar 31 2026
Optimal weight calculator
 */
import java.util.*;
import java.text.*;

public class Weight {
    public static void main(String[] args) {

        final double FIVE_FEET = 60;
        final double MULTIPLIER = 2.3;

        DecimalFormat df = new DecimalFormat("#.##");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your gender(0=male, 1 = female, 2= non-binary: ");
        int gender = scanner.nextInt();
        System.out.println("Please enter your height in inches: ");        
        int height = scanner.nextInt();

        if (gender == 0) {
            System.out.print(df.format(50+ (height-FIVE_FEET)*MULTIPLIER));
        } else if (gender == 1) {
            System.out.print(df.format(45.5+ (height-FIVE_FEET)*MULTIPLIER));
        } else if (gender == 2) {
            System.out.print(df.format(47.7+ (height-FIVE_FEET)*MULTIPLIER));
        }


    }

}
