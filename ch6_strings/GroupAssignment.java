package ch6_strings;
import java.util.*;

public class GroupAssignment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.toUpperCase();

        int name = (int)input.charAt(0);

        if (name >= 65 && name<=73) {
            System.out.println("Group 1.");
        } else if (name >= 74 && name<=83) {
            System.out.println("Group 2.");
        } else {
            System.out.println("Group 3.");           
        }
        



    }
}


/*
65
73 */