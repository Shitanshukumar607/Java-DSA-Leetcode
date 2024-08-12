
// Find the maximum & minimum number in an array of integers. 

import java.util.*;

public class MaximumMinimum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The size of ur array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            sc.close();
            return;
        }

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {

            int number = sc.nextInt();
            numbers[i] = number;
        }
        sc.close();

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }

        }

        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);

    }
}
