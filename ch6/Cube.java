package ch6;
import java.util.*;

public class Cube {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;

        while (n > 0) {
            sum += Math.pow(n % 10, 3);
            n = n / 10;

            
        }

        System.out.print(sum);

}
}