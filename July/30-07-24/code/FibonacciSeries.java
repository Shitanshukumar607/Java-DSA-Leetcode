// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 

import java.util.*;

public class FibonacciSeries {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        sc.close();

        printFibonacci(n);
    }

    public static void printFibonacci(int x) {

        int firstNo = 0;
        int secondNo = 1;

        if (x <= 0) {
            return;
        } else if (x == 1) {
            System.out.print(firstNo);
        } else {
            System.out.print(firstNo + " " + secondNo);
        }

        // System.out.println(firstNo + " ");
        // System.out.println(secondNo + " ");

        for (int i = 3; i <= x; i++) {

            // System.out.print(firstNo);

            // System.out.print(secondNo);

            int nextNo = firstNo + secondNo;

            System.out.print(" " + nextNo);

            firstNo = secondNo;
            secondNo = nextNo;

        }

    }

}