// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;

public class CheckAbleToVote {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ur age: ");
        int age = sc.nextInt();

        sc.close();

        System.out.print(checkCondition(age));
    }

    public static String checkCondition(int x) {

        if (x >= 18) {

            return "Able to Vote";

        } else {
            return "Not able to Vote";

        }

    }

}