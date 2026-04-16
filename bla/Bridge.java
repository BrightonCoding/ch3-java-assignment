package bla;
/*
Brighton Ng
Mar 31 2026
Bridge tool calculator
 */
import java.util.*;

public class Bridge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of axle: ");
        int axle = scanner.nextInt();

        switch(axle) {
            case 2: System.out.print("The toll is $3.00."); break;

            case 3: System.out.print("The toll is $5.25."); break;
            case 4: 
            case 5: System.out.print("The toll is $8.25."); break;
            case 6: System.out.print("The toll is $9.25."); break;
        }




    }

}
