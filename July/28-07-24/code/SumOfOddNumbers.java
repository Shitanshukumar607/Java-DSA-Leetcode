// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;

public class SumOfOddNumbers {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        int n = sc.nextInt();
        sc.close();

        System.out.print(calculateSumOfOddNumbers(n));
    }

    public static int calculateSumOfOddNumbers(int x) {

        int ans = 0;

        for (int i = 1; i <= x; i++) {

            if (i % 2 == 1) {
                ans += i;
            }
        }

        return ans;

    }

}