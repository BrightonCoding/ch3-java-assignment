/* 
Author Brighton Ng
March 6th, 2025
Time conversion calculator
 */

 
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        final int MINUTES_IN_HOUR = 60;


        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(); // total minutes to convert
        
        int hour = m / MINUTES_IN_HOUR; // whole hours
        int minutes = m % MINUTES_IN_HOUR; // remaining minutes

        
        System.out.format("%d:%02d%n", hour, minutes);

    } 

}