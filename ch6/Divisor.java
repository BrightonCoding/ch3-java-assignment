package ch6;
import java.util.*;

public class Divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int remainder = 1;

        while (remainder > 0) {
            remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        System.out.print(num1);

    }
}

/*



get the remainder of num1 / num2.
set num1 to num2.
set num2 to the remainder found above.
repeat while num2 is not zero.


4, 6;

4 % 6 = 4

num1=6
num2=4

6 % 4 = 2

4 % 2 = 0


*/