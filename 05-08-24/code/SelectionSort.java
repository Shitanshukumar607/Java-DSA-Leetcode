// Selection Sort alogorithm 

// O(n square)

public class SelectionSort {

    public static void main(String args[]) {

        int[] array = new int[] { 6, 4, 8, 2, 9, 6, 3, 7, 5, 8 };

        for (int i = 0; i < array.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < array.length; j++) {

                // find smoler element
                if (array[j] < array[min]) {
                    min = j;
                }

            }

            // swap
            int temp = array[i];

            array[i] = array[min];
            array[min] = temp;

        }

        // print results
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
