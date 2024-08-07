// Check if an array is sorted (strictly increasing).

public class IsThatAIncreasingArray {

    public static boolean checkIncreasing(int[] array, int index) {

        if (index == array.length) {
            return true;
        }

        if (array[index] <= array[index - 1]) {
            return false;
        }

        return checkIncreasing(array, index + 1);

    }

    public static void main(String args[]) {
        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 10 }; // true 
        int[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8, 7, 10 }; // false
        int[] array3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // true

        System.out.println(checkIncreasing(array1, 1));
        System.out.println(checkIncreasing(array2, 1));
        System.out.println(checkIncreasing(array3, 1));

    }

}