// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;

public class Circumference {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");

        double r = sc.nextDouble();
        sc.close();

        System.out.print("Circumference is " + FindCircumference(r));
    }

    public static double FindCircumference(double rad) {

        return 2 * Math.PI * rad;

    }

}
