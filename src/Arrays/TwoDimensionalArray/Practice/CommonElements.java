package Arrays.TwoDimensionalArray.Practice;

public class CommonElements {
    public static void main(String[] args) {
        int[][] a1 = new int[][]{
                {1, 2, 1},
                {9, 7, 2},
                {7, 6, 4}
        };

        int[][] a2 = new int[][]{
                {2, 6, 8, 6},
                {0, 1, 3, 9, 7},
                {7, 2, 0},
                {8, 3}
        };
        int[] common = new int[10];
        int ind = 0;
        for (int i = 0; i < a1.length; i++) {

            for (int j = 0; j < a1[i].length; j++) {
                int ele = a1[i][j];
                boolean check = false;

                for (int k = 0; k < a2.length; k++) {
                    for (int l = 0; l < a2[k].length; l++) {
                        if (ele == a2[k][l]) {
                            check = true;
                            break;
                        }
                    }
                    if (check) {
                        break;

                    }
                }
                boolean exists = false;

                for (int m = 0; m < common.length; m++) {
                    if (common[m] == ele) {
                        exists = true;
                        break;
                    }

                }
                if (!exists && check) {
                    common[ind] = ele;
                    ind++;
                }
            }
        }
        for (int i = 0; i < ind; i++) {
            System.out.print(common[i] + " ");
        }

    }
}
