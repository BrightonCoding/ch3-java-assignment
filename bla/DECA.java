package bla;
import java.util.*;

public class DECA {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mark = scanner.nextInt();

        switch (mark) {
            case 1: System.out.print("You got in!"); break;
            case 2: System.out.print("Unfortunately, due to the sheer number of applications this year, we regret to inform you that you're not selected as a provincial officer."); break;
            case 3: System.out.print("Fuck you."); break;
            default: System.out.print("Hello DECA!");
        }

    }
}
