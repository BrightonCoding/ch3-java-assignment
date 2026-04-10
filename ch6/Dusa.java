package ch6;
import java.util.Scanner;

public class Dusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dusa = scanner.nextInt();
        while (scanner.hasNextInt()) {
            int yobi = scanner.nextInt();
            if (yobi < dusa) {
                dusa += yobi;
            } else {
                break;
            }
        }
        System.out.println(dusa);
    }
}
