package ch6;

public class PowersTable {
    public static void main(String[] args) {
        // Print header row
        for (int power = 1; power <= 5; power++) {
            System.out.printf("%8s", "x^" + power);
        }
        System.out.println();

        // Print each row (x from 1 to 6)
        for (int x = 1; x <= 6; x++) {
            for (int power = 1; power <= 5; power++) {
                System.out.printf("%8d", (int) Math.pow(x, power));
            }
            System.out.println();
        }
    }
}