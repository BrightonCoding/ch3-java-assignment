/*
 * Brighton Ng
 * March 24, 2026
 * Displays hurricane wind speed ranges based on the entered category.
 */

import java.util.Scanner;

public class Hurricane {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the hurricane category (1-5): ");
        int category = input.nextInt();

        switch (category) {
            case 1:
                System.out.println("Category 1: 74-95 mph, 64-82 kt, 119-153 km/hr");
                break;
            case 2:
                System.out.println("Category 2: 96-110 mph, 83-95 kt, 154-177 km/hr");
                break;
            case 3:
                System.out.println("Category 3: 111-130 mph, 96-113 kt, 178-209 km/hr");
                break;
            case 4:
                System.out.println("Category 4: 131-155 mph, 114-135 kt, 210-249 km/hr");
                break;
            case 5:
                System.out.println("Category 5: greater than 155 mph, greater than 135 kt, greater than 249 km/hr");
                break;
            default:
                System.out.println("Invalid hurricane category.");
        }

        input.close();
    }
}
