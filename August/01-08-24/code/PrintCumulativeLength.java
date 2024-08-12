// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;

public class PrintCumulativeLength {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("size of array: ");
        int size = sc.nextInt();

        sc.nextLine();

        String[] array = new String[size];

        for (int i = 0; i < size; i++) {

            System.out.print(i);

            array[i] = sc.nextLine();
        }
        sc.close();

        int length = 0;
        for (int i = 0; i < array.length; i++) {

            length = length + array[0].length();

        }

        System.out.println("the cumulative length is " + length);

    }

}
