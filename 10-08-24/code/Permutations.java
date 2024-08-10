// Print all the permutations of a string.

public class Permutations {

    public static void printPermutation(String str,
            String permutateString) {

        if (str.length() == 0) {
            System.out.println(permutateString);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            String newString = str.replaceAll(String.valueOf(current), "");
                                                         
            printPermutation(newString, permutateString + current);

        }

    }

    public static void main(String args[]) {

        String str = "abc";

        printPermutation(str, "");

    }

}
