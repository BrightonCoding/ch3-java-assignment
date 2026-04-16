package ch6_strings;
import java.util.*;

public class CountCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        int num = 0;

        for (int i = 0; i <= sentence.length() - 4; i++) {

                if (sentence.charAt(i) == 'c' && sentence.charAt(i+1) == 'o' &&     sentence.charAt(i+3) == 'e') {
                    num++;
     
                }

            }
            System.out.println(num);
        }


        
    }



                    /*
                    
                    for (int i = 0; i < sentence.length(); i++) {

    for (int j = 0; j < vowel.length; j++) {
        if (vowel[j] == sentence.charAt(i)) {
            num++;
    } */