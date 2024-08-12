//  Print all the subsets of a set of first n natural numbers.

public class findSubset {

    public static void printSubsets(int n, String subsets) {

        if (n == 0) {

            for (int i = 0; i < subsets.length(); i++) {
                System.out.print(subsets.charAt(i) + " ");
            }

            System.out.println();
            return;
        }

        printSubsets(n - 1, subsets + String.valueOf(n));

        printSubsets(n - 1, subsets);

    }

    public static void main(String args[]) {

        int n = 4;

        printSubsets(n, "");

    }

}
