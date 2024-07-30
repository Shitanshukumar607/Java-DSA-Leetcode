// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xN.

import java.util.*;

public class Exponential {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = sc.nextInt();

        System.out.print("Enter power number: ");
        int power = sc.nextInt();
        sc.close();

        System.out.print(findAnswer(base, power));
    }

    public static int findAnswer(int base, int power) {

        int ans = 1;

        if (power < 0) {

            System.out.print("cant print for the negative powers");
            return 0;

        } else if (power == 0) {
            return 0;
        }

        for (int i = 1; i <= power; i++) {

            ans = ans * base;
        }

        return ans;

    }

}