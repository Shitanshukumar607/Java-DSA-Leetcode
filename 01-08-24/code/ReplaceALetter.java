// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

// Example:
// original =  "eabcdef" ; result = “iabcdif” 
// Original = “xyz” ; result = “xyz”

import java.util.*;

public class ReplaceALetter {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("input ur word : ");
        String original = sc.nextLine();

        String result = "";

        for (int i = 0; i < original.length(); i++) {

            if (original.charAt(i) == 'e') {

                result += "i";

            } else {

                result += original.charAt(i);

            }

        }
        sc.close();

        System.out.println("replaced word is " + result);

    }

}
