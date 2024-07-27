// Hollow Butterfly

// *       **
// **     * *
// * *   *  *
// *  * *   *
// *   *    *
// *  * *   *
// * *   *  *
// **     * *
// *       **
// *        *

public class HollowButterfly {
    public static void main(String args[]) {
        int n = 10;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n ; j++) {


                if (j == 1 || j == i  || j == n || j == n - i){

                    System.out.print("*");
                }
                else {
                    System.out.print(" ");

                }
            }

            System.out.println();

        }
    }

}
