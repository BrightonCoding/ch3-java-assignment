import java.util.Scanner;

/*
 * Brighton Ng
 * Date: 2026-03-25
 */

public class PrintingPieces {
    public static void main(String[] args) {
        final int FIRST_TIER_MAXIMUM = 99;
        final int SECOND_TIER_MINIMUM = 100;
        final int SECOND_TIER_MAXIMUM = 499;
        final int THIRD_TIER_MINIMUM = 500;
        final int THIRD_TIER_MAXIMUM = 749;
        final int FOURTH_TIER_MINIMUM = 750;
        final int FOURTH_TIER_MAXIMUM = 1000;

        final double PRICE_0_TO_99 = 0.30;
        final double PRICE_100_TO_499 = 0.28;
        final double PRICE_500_TO_749 = 0.27;
        final double PRICE_750_TO_1000 = 0.26;
        final double PRICE_OVER_1000 = 0.25;

        Scanner scanner = new Scanner(System.in);
        int numberOfCopies = scanner.nextInt();
        double pricePerCopy;

        if (numberOfCopies <= FIRST_TIER_MAXIMUM) {
            pricePerCopy = PRICE_0_TO_99;
        } else if (numberOfCopies >= SECOND_TIER_MINIMUM && numberOfCopies <= SECOND_TIER_MAXIMUM) {
            pricePerCopy = PRICE_100_TO_499;
        } else if (numberOfCopies >= THIRD_TIER_MINIMUM && numberOfCopies <= THIRD_TIER_MAXIMUM) {
            pricePerCopy = PRICE_500_TO_749;
        } else if (numberOfCopies >= FOURTH_TIER_MINIMUM && numberOfCopies <= FOURTH_TIER_MAXIMUM) {
            pricePerCopy = PRICE_750_TO_1000;
        } else {
            pricePerCopy = PRICE_OVER_1000;
        }

        double totalCost = numberOfCopies * pricePerCopy;

        System.out.printf("%.2f%n", pricePerCopy);
        System.out.printf("%.2f%n", totalCost);
    }
}
