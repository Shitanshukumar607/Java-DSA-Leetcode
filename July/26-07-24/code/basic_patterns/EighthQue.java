// Floyd's Triangle 

// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20 21

public class EighthQue {
    public static void main(String[] args) {

        int n = 5;
        int counter = 1;

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }

            System.out.println();
        }
    }
}
