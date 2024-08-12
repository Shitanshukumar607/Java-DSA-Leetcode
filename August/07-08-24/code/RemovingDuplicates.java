// remove duplicates from a string

public class RemovingDuplicates {

    public static boolean[] present = new boolean[26];
    public static StringBuilder newString = new StringBuilder();

    public static StringBuilder removeDuplicates(String str, int index) {

        if (index == str.length() - 1) {
            return newString;
        }

        char current = str.charAt(index);

        if (present[current - 'a'] == false) {

            present[current - 'a'] = true;
            newString.append(current);

        }

        return removeDuplicates(str, index + 1);

    }

    public static void main(String args[]) {

        String str = "abcadbcefghabi";
        int index = 0;

        System.out.println(removeDuplicates(str, index));

    }
}