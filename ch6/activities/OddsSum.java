package ch6.activities;
import java.util.*;

public class OddsSum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;

        for (int i=1; i<=x; i++) {
            if ((i%2) == 1) {
                sum+= i;
            }
        }

        System.out.print(sum);


    }
}
