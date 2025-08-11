package _7_Arrays.TwoDimensionalArray.Practice;

public class SquareOfElements {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {2, 3, 5},
                {0, 1, 3},
                {1, 2, 4}
        };
        int[][] res= new int[3][3];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                res[i][j] = a[i][j] * a[i][j];
            }
        }
        for (int i = 0; i <res.length ; i++) {
            for (int j = 0; j <res[i].length ; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
