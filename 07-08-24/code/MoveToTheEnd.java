// Move all "x" to the end of the string .

public class MoveToTheEnd {

    public static int count = 0;
    public static StringBuilder newString = new StringBuilder();

    public static void print(String name, char target, int index) {

        if (index == name.length()) {

            for (int i = 0; i < count; i++) {
                newString.append(target);
            }

            System.out.println(newString);
            return;
        }

        if (name.charAt(index) == target) {
            count++;
        } else {
            newString.append(name.charAt(index));
        }

        print(name, target, index + 1);
    }

    public static void main(String args[]) {

        String name = "axbcdxefxgxx";

        char target = 'x';

        print(name, target, 0);
    }

}
