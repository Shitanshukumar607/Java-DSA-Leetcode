
// Print the spiral order matrix as output for a given matrix of numbers.

// Example : 

// Your matrix :
// 0 1 2 3 4
// 5 6 7 8 9
// 10 11 12 13 14
// 15 16 17 18 19
// 20 21 22 23 24

// The spiral order matrix is :
// 0 1 2 3 4 9 14 19 24 23 22 21 20 15 10 5 6 7 8 13 18 17 16 11 12

import java.util.*;

public class SpiralOrderMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("row: ");
        int row = sc.nextInt();

        System.out.print("column: ");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("matrix[" + i + "][" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }

        }

        System.out.println("Your matrix : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" ");

        sc.close();

        // int row = 5;
        // int column = 5;
        // int[][] matrix = {
        // { 1, 2, 3, 4, 5 },
        // { 6, 7, 8, 9, 10 },
        // { 11, 12, 13, 14, 15 },
        // { 16, 17, 18, 19, 20 },
        // { 21, 22, 23, 24, 25 }
        // };

        System.out.println("The spiral order matrix is : ");
        printSpiralOrderMatrix(row, column, matrix);

    }

    public static void printSpiralOrderMatrix(int row, int column, int[][] array) {

        int rowStart = 0;
        int rowEnd = row - 1;

        int columnStart = 0;
        int columnEnd = column - 1;

        while (rowStart <= rowEnd && columnStart <= columnEnd) {

            for (int i = columnStart; i <= columnEnd; i++) {
                System.out.print(array[rowStart][i] + " ");
            }

            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(array[i][columnEnd] + " ");
            }

            columnEnd--;

            for (int i = columnEnd; i >= columnStart; i--) {
                System.out.print(array[rowEnd][i] + " ");
            }

            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(array[i][columnStart] + " ");
            }

            columnStart++;

        }

    }
}
