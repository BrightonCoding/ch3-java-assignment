/*
Brighton Ng
Mar 13 2026
Invoice application
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double purchasePrice;
        System.out.print("Enter purchase price:");
        purchasePrice = input.nextDouble();

        
        double discountPrice;
        System.out.print("Enter discount price:");
        discountPrice = input.nextDouble();  

        DecimalFormat df = new DecimalFormat("0.00");

        double discountedPrice;
        discountedPrice = purchasePrice * (1 - discountPrice);
        System.out.print("Discounted Price: $" + df.format(discountedPrice));






    }
}