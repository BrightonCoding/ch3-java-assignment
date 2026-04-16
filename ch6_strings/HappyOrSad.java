package ch6_strings;
import java.util.*;

public class HappyOrSad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        int numHappy = 0;
        int numSad = 0;
    

        for (int i = 0; i <= sentence.length() - 3; i++) {

            String match = sentence.substring(i, i+3);

            if (match.equals(":-)")) {
                numHappy++;
            } else if (match.equals(":-(")) {
                numSad++;
            }
    }
    if (numHappy == 0 && numSad == 0) {
        System.out.println("none");
    } else if (numHappy == numSad) {
        System.out.println("unsure");
    } else if (numSad > numHappy) {
        System.out.println("sad");
    } else {
        System.out.println("happy");            
    }
}
}

