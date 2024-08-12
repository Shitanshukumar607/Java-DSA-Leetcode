
import java.util.*;

public class InputAndPrint2dArray {
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
        sc.close();

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();

        }

    }
}
