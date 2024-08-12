// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class GreaterNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");

        int a = sc.nextInt();

        System.out.print("Enter second number: ");

        int b = sc.nextInt();
        sc.close();

        System.out.print( FindGreatest(a, b) + " is Greater");
    }

    public static int FindGreatest(int x, int y) {

        if (x > y) {
            return x;
        } else {
            return y;
        }

    }

}
