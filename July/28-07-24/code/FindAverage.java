// Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class FindAverage {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        int AverageNumber = Average(a, b, c);

        System.out.print(AverageNumber);
    }

    public static int Average(int p, int q, int r) {

        return (p + q + r) / 3;

    }

}