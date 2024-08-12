// Input an email from the user.You have to create a username from the email by deleting the part that comes after‘@’.Display that username to the user.

// Example:
// Email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
// email = “helloWorld123@gmail.com” ; username = “helloWorld123”

import java.util.*;

public class GetUsername {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("input ur email : ");
        String email = sc.nextLine();
        sc.close();

        int index = getIndex(email);

        String username = "";

        if (index != 1) {

            username = email.substring(0, index);
            System.out.println("ur username is " + username);

        } else {
            System.out.println("not a valid email");
        }

    }

    public static int getIndex(String email) {

        for (int index = 0; index < email.length(); index++) {

            if (email.charAt(index) == '@') {

                return index;

            }

        }

        return -1;
    }

}
