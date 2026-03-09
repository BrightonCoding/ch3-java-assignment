/* 
Author Brighton Ng
March 6th, 2025
This is a program to calculate the cost of making a pizza based on its diameter
 */


import java.util.Scanner;

public class PizzaCost {

    public static void main(String[] args) {
        final double LABOUR_COST = 0.75;
        final double RENT_COST = 1.00;
        final double MATERIALS = 0.05;

    
        Scanner scan = new Scanner(System.in);
        int diameter = scan.nextInt(); // pizza diameter in inches
        double materialsCost = MATERIALS * diameter * diameter; // dough + toppings cost
        double pizzaCost = LABOUR_COST + RENT_COST + materialsCost;
        System.out.printf("$%.2f", pizzaCost);
    }
    
}