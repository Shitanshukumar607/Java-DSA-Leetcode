// For a given matrix of N x M, print its transpose.

import java.util.*;

public class TransposeMatrix {

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
        // int column = 5 ;
        // int[][] matrix = {
        // { 1, 2, 3, 4, 5 },
        // { 6, 7, 8, 9, 10 },
        // { 11, 12, 13, 14, 15 },
        // { 16, 17, 18, 19, 20 },
        // { 21, 22, 23, 24, 25 }
        // };


        System.out.println("The transpose matrix is :");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }

}
