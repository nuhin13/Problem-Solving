public class Minimum_Path_Sum_64 {

    public int minPathSum(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == 0 || j == 0) {
                    if (i == 0 && j != 0) {
                        mat[i][j] = mat[i][j] + mat[i][j - 1];
                    } else if (j == 0 && i != 0) {
                        mat[i][j] = mat[i][j] + mat[i - 1][j];
                    }
                    continue;
                }

                int minValue = Math.min(mat[i][j] + mat[i - 1][j], mat[i][j] + mat[i][j - 1]);
                mat[i][j] = minValue;
            }
        }

        return mat[mat.length - 1][mat[0].length - 1];
    }
}
