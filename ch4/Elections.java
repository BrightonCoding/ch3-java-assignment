/* 
Author Brighton Ng
March 6th, 2025
Elections table
 */
 
import java.util.Scanner;

public class Elections {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int v1 = scan.nextInt(); // votes for first candidate
        int v2 = scan.nextInt();
        int v3 = scan.nextInt();
        scan.nextLine(); // consume newline after last number
        String c1 = scan.nextLine();
        String c2 = scan.nextLine();
        String c3 = scan.nextLine();

        int tv = v1 + v2 + v3; // total votes cast
        double p1 = 100.0 * v1 / tv;
        double p2 = 100.0 * v2 / tv;
        double p3 = 100.0 * v3 / tv;

        String p1Str = String.format("%.2f %%", p1);
        String p2Str = String.format("%.2f %%", p2);
        String p3Str = String.format("%.2f %%", p3);

        System.out.format("%-15s %10s %15s%n", "Candidate", "Votes", "Percentage");
        System.out.format("%-15s %10d %15s%n", c1, v1, p1Str);
        System.out.format("%-15s %10d %15s%n", c2, v2, p2Str);
        System.out.format("%-15s %10d %15s%n%n", c3, v3, p3Str);
        System.out.format("%-15s %10d", "TOTAL VOTES:", tv);
    } 

}