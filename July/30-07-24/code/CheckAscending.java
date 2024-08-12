// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//      {3, 4, 6, 2} is not sorted in ascending order.

import java.util.*;

public class CheckAscending {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("The size of ur array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {

            int number = sc.nextInt();
            numbers[i] = number;
        }

        System.out.print(check(numbers));

        sc.close();

    }

    public static boolean check(int[] numbers) {

        boolean isAscending = true;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] > numbers[i + 1]) {

                isAscending = false;

            }
        }

        return isAscending;
    }

}
