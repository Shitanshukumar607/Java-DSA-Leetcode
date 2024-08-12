// Print keypad combination
// 0 -> .
// 1 -> abc
// 2 -> def
// 3 -> ghi
// 4 -> jkl
// 5 -> mno
// 6 -> pqrs
// 7 -> tu
// 8 -> vwx
// 9 -> yz
// )

public class KeypadCombination {

    public static String[] keys = new String[] { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printCombination(String number, int index, String combination) {

        if (index == number.length()) {
            System.out.println(combination);
            return;
        }

        int current = number.charAt(index) - '0';

        String keypadText = keys[current];

        for (int i = 0; i < keypadText.length(); i++) {

            printCombination(number, index + 1, combination + keypadText.charAt(i));

        }

    }

    public static void main(String args[]) {

        String number = "20";

        printCombination(number, 0, "");

    }

}
