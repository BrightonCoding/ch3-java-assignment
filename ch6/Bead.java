package ch6;
import java.util.Scanner;

public class Bead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            String result = a + " " + b;
            int x = a, y = b;
            while (true) {
                int next = (x + y) % 10;
                x = y;
                y = next;
                if (x == a && y == b) break;
                result += " " + x;
            }
            System.out.println(result);
        }
    }
}