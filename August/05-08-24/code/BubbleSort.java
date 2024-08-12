// Bubble Sort alogorithm 

// O(n square)

public class BubbleSort {

    public static void main(String args[]) {

        int[] array = new int[] { 6, 4, 8, 2, 9, 6, 3, 7, 5, 8 };

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];

                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }

    }

}
