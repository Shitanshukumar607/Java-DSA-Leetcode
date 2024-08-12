// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

import java.util.*;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        String choice;

        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.print("Want to enter another number? (y/n): ");
            choice = sc.next();
            

        } while (choice.equals("y"));

        sc.close();

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }

}
