package _7_Arrays.TwoDimensionalArray.Practice;

public class AddElements {
    public static void main(String[] args) {
        int[][] a1 = new int[][]{
                {1, 2, 1},
                {9, 7, 2},
                {7, 6, 4}
        };

        int[][] a2 = new int[][]{
                {2, 6, 8},
                {0, 1, 3},
                {1, 2, 4}
        };
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                System.out.print(a1[i][j] + a2[i][j] + " ");
            }
            System.out.println();

        }
    }
}
