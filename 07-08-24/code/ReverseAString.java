// Print a string in reverse order

public class ReverseAString {

    public static void print(String name , int index) {

        if (index == -1){
            return;
        }

        System.out.print(name.charAt(index));
        print(name, index - 1);
    }

    public static void main(String args[]) {
        
        String name = "abcdefgh";
        int index = name.length() - 1;

        print(name, index);
    }

}
