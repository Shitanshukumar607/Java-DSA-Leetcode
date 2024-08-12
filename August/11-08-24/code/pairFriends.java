//  Friends pairing problem

public class pairFriends {

    public static int callGuest(int n) {

        if (n <= 1) {
            return 1;
        }

        int a = callGuest(n - 1);

        int b = (n - 1) * callGuest(n - 2);

        return a + b;

    }

    public static void main(String args[]) {

        int n = 4;

        System.out.println(callGuest(n));

    }

}
