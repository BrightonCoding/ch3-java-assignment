package ch7;
import java.util.*;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to convert?");
        String choice = scanner.nextLine();
        System.out.println("Enter the number to convert:");
        double input = scanner.nextDouble();

        if (choice.equals("hours to minutes")) {
            hoursMinutes(input);
        } else if (choice.equals("days to hours")) {
            daysHours(input);
        } else if (choice.equals("minutes to hours")) {
            minutesHours(input);
        } else {
            hoursDays(input);
        }
        
    }

    public static void hoursMinutes(double input) {
        double result = input * 60;
        System.out.println(result);
    }

    public static void daysHours(double input) {
        double result = input * 24;
        System.out.println(result);
    }

    public static void minutesHours(double input) {
        double result = input / 60;
        System.out.println(result);
    }

    public static void hoursDays(double input) {
        double result = input / 24;
        System.out.println(result);
    }



}
