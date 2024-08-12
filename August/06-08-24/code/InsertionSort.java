// Insertion Sort alogorithm 
// O(n square)

public class InsertionSort {

    public static void main(String args[]) {

        int[] array = new int[] { 6, 1, 3, 8, 6, 8 };

        for (int i = 1; i < array.length; i++) {

            int j = i - 1;
            int key = array[i];

            while (j >= 0 && array[j] > array[i]) {

                array[j + 1] = array[j];
                j--;

            }

            array[j + 1] = key;

        }

        // print results
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
