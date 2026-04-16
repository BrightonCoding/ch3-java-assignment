package ch6_strings;
import java.util.*;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        char[] vowel = {'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U'};

        int num = 0;

        
        for (int i = 0; i < sentence.length(); i++) {

            for (int j = 0; j < vowel.length; j++) {
                if (vowel[j] == sentence.charAt(i)) {
                    num++;
            }

        }
    }

    System.out.print(num);


    }
}
