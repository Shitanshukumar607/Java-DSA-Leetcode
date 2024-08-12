
// Take an array of names as input from the user and print them on the screen.

import java.util.*;

public class TakeInputAndPrintArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The size of ur array: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {

            String name = sc.next();
            names[i] = name;
        }


        System.out.print("Names are: ");

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        sc.close();

    }
}
