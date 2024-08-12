// First and last occurance of a element in a string

public class FirstAndLastOccuranceOfAnElement {

    public static void findOccurnace(String name, char target, int first, int last, int index) {

        if (index == name.length()) {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
            return;
        }

        if (name.charAt(index) == target && first == -1) {
            first = index;
        } else if (name.charAt(index) == target) {

            last = index;

        }

        findOccurnace(name, target, first, last, index + 1);
    }

    public static void main(String args[]) {

        String name = "ababsbdsdaba";


        char target = 'a';

        int first = -1;
        int last = -1;

        findOccurnace(name, target, first, last, 0);
    }

}
