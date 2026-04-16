package ch6_strings;
import java.util.*;

public class StringRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();


        System.out.print(s1.replaceAll("\\b" + s2 + "\\b ?", ""));

    }
}
