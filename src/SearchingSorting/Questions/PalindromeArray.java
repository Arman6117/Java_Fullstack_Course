package SearchingSorting.Questions;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        boolean equal = false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != arr[arr.length - 1 - i]) {
                equal = false;
                break;
            } else {
                equal = true;
            }
        }

        if (equal) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not");
        }



    }

}
