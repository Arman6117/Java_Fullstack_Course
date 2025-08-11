package _9_SearchingSorting;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {2, 3, 41, 6, 8, 1};
        int max = arr[0], min = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }

        }

        System.out.println("Largest element in array: " + max );
        System.out.println("Smallest element in array: " + min);
    }
}
