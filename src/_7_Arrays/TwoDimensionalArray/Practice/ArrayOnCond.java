package _7_Arrays.TwoDimensionalArray.Practice;

public class ArrayOnCond {
    public static void main(String[] args) {
        int[][] a1 = new int[][]{
                {1, 2, 1},
                {9, 7, 2},
                {7, 6, 4}
        };
        int[][] a2 = new int[][]{
                {1, 6, 1},
                {0, 7, 3},
                {1, 6, 4}
        };
        int[][] res = new int[3][3];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                if (a1[i][j] == a2[i][j]) {
                    res[i][j] = 1;
                } else {
                    res[i][j] = 0;
                }
            }

        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
