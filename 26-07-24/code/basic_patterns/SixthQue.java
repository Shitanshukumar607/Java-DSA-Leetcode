// Half Pyramid with Numbers

// 1
// 12
// 123
// 1234
// 12345


public class SixthQue {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
