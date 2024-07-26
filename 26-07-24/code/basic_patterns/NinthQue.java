// 0 1 Triangle 

// 1 
// 0 1
// 0 1 0
// 1 0 1 0
// 1 0 1 0 1

public class NinthQue {
    public static void main(String[] args) {

        int n = 5;
        int counter = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(counter + " ");

                if (counter == 1) {
                    counter = 0;
                } else {
                    counter = 1;
                }
            }

            System.out.println();
        }
    }
}
