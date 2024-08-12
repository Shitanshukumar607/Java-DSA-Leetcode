// Print factorial of a number n.

public class FactorialOfANumber {

    public static void print(int n, int ans) {

        if (n == 0) {
            System.out.println(ans);
            return;
        }

        ans *= n;

        print(n - 1, ans);
    }

    public static void main(String args[]) {
        int n = 7;
        int ans = 1 ;
        print(n, ans);
    }

}
