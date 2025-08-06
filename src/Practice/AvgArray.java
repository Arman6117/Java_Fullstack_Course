package Practice;

public class AvgArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,9,6};
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        float avg = (float)sum/arr.length;
        System.out.println("Average of given array: " + avg);

    }
}
