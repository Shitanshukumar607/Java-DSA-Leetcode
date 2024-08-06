// Print the fibonacci sequence till nth term.

// 0 1 1 2 3 5 8

public class FibonacciSequence {

    public static void print(int target, int current, int next) {

        if (target == 0) {
            return;
        }

        System.out.print(current + " ");

        target--;
        print(target
        , next, current + next);
    }

    public static void main(String args[]) {
        int target = 10;
        int next = 1;
        int current = 0;
        print(target, current, next);
    }

}
