package bla;
import java.util.*;

public class ShippingChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter package length: ");
        int length = scanner.nextInt();
        System.out.println("Enter package width: ");
        int width = scanner.nextInt();
        System.out.println("Enter package height: ");
        int height = scanner.nextInt();
        System.out.println("Enter package weight: ");
        int weight = scanner.nextInt();

       int volume = length * width * height;


       if (length > 15 || width > 15 || height > 15 || weight > 25) {
        System.out.println("Package rejected");
       } else if (volume >= 1000) {
        System.out.print("Large package accepted");
       } else {
        System.out.print("Standard package accepted");
       }







        
    }


}