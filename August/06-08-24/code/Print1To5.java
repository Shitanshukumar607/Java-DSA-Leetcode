// Print numbers from 1 to 5.

public class Print1To5 {

    public static void print(int n) {

        if (n == 6) {
            return;
        }

        System.out.println(n);
        print(n + 1);
    }

    public static void main(String args[]) {
        int number = 1;
        print(number);
    }

}
