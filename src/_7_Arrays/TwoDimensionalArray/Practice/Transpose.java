package _7_Arrays.TwoDimensionalArray.Practice;

public class Transpose {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1, 8, 4},
                {9, 7, 2},
                {7, 6, 4}
        };


        int[][] t = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                t[i][j] = a[j][i];
            }
        }
        for (int i = 0; i <t.length ; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] +" ");
            }
            System.out.println();
        }
    }
}
