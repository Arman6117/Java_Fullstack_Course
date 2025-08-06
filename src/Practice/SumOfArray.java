package Practice;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,9,6};
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Sum of given array: "+ sum);

    }
}
