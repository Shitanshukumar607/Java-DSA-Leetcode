// Print the sum of first n natural numbers.

public class SumOfNauturalNumbers {

    public static void print(int n, int sum) {

        if (n == 0) {
            System.out.println(sum);
            return;
        }

        sum += n;

        print(n - 1, sum);
    }

    public static void main(String args[]) {
        int n = 5;
        int sum = 0;
        print(n, sum);
    }

}
