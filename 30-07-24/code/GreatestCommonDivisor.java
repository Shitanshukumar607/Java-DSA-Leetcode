// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xN.

import java.util.*;

public class GreatestCommonDivisor {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();

        System.out.print(findAnswer(a, b));
    }

    public static int findAnswer(int x, int y) {

        int divident;
        int divisor;

        if (x > y) {
            divisor = y;
            divident = x;
        } else {
            divident = y;
            divisor = x;
        }

        do {

            int quotient = divident / divisor;
            int remainder = divident % divisor;

            System.out.println(divident + " " + divisor);
            System.out.println(quotient + " " + remainder);

            System.out.println("in a loop");

            divident = divisor;
            divisor = remainder;

        } while (divisor != 0);

        return divident;

    }

}