//  Tiling problem

public class PlaceTiles {

    public static int chooseTiles(int n, int m) {

        if (n < m) {
            return 1;
        } else if (n == m) {
            return 2;
        }

        return chooseTiles(n - 1, m) + chooseTiles(n - m, m);

    }

    public static void main(String args[]) {

        int n = 4, m = 2;

        System.out.println(chooseTiles(n, m));

    }

}
