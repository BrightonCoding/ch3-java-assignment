package bla;
/*Brighton Ng
Mar 30 2026
Tariff calculator with switch
 */

import java.util.*;

public class Tariff {
    public static void main(String[] args) {
        Random r = new Random();

        int die = r.nextInt(6)+1;

        switch (die) {
            case 1: 
            case 2:
            System.out.print("Tariff is 10%"); break;

            case 3: System.out.print("Tariff is 20%"); break;

            case 4: case 5:
                System.out.print("Tariff is 24%"); break;
            case 6: System.out.print("Tariff is 49%"); break;
        }


    }
}
