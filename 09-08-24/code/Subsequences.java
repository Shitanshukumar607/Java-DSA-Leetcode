// Print all the subsequences of a string.

public class Subsequences {

    public static void printSubsequences(String str, int index, String newString) {

        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        
        printSubsequences(str, index + 1, newString + str.charAt(index));

        printSubsequences(str, index + 1, newString);

    }

    public static void main(String args[]) {

        String str1 = "abc";

        printSubsequences(str1, 0, "");

    }

}
