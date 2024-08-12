// Print all unique subsequences of a string.

import java.util.*;

public class UniqueSubsequences {

    public static HashSet<String> set = new HashSet<>();

    public static void printSubsequences(String str, int index, String newString) {

        if (index == str.length()) {

            if (set.contains(newString)) {
                return;
            } else {
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }

        printSubsequences(str, index + 1, newString + str.charAt(index));

        printSubsequences(str, index + 1, newString);

    }

    public static void main(String args[]) {

        String str1 = "aaa";

        printSubsequences(str1, 0, "");

    }

}
