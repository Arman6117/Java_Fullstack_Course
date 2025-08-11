package _9_SearchingSorting;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 10, 8};
        int first = arr[0];
        int second = 0;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if(num > second && num != first) {
                second = num;
            }

        }
        System.out.println("Second largest number: " + second);
    }
}
