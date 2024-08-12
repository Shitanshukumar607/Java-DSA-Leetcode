// Count Paths to complete Maze 

public class CountPathMaze {

    public static int chooseDir(int m, int n, int i, int j) {

        if (i >= m - 1 || j >= n - 1) {
            return 1;
        }

        return chooseDir(m, n, i + 1, j) + chooseDir(m, n, i, j + 1);
    }

    public static void main(String args[]) {

        int m = 4, n = 5;

        System.out.println(chooseDir(m, n, 0, 0));
    }

}
