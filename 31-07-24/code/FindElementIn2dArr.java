
// Take an array of names as input from the user and print them on the screen.

import java.util.*;

public class FindElementIn2dArr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("row: ");
        int row = sc.nextInt();

        System.out.print("column: ");
        int column = sc.nextInt();

        int[][] numbers = new int[row][column];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("numbers[" + i + "][" + j + "] : ");
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("The number u want to search : ");
        int target = sc.nextInt();
        sc.close();

        int[] index = findElement(row, column, target, numbers);

        if (index[0] != -1) {
            System.out.println("Element found at row " + index[0] + " and column " + index[1]);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int[] findElement(int row, int column, int target, int[][] array) {

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                if (array[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}
