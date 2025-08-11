package _7_Arrays.TwoDimensionalArray.Practice;

public class SumOfArray {
    public static void main(String[] args) {
        int[][ ] a = new int[][] {
                {1,8,4},
                {9,7,2},
                {7,6,4}
        };
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                sum += a[i][j];
            }

        }
        System.out.println("Sum of array: " + sum);
    }
}
