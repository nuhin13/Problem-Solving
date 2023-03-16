public class UniquePaths_62 {

    // Time Limit exits
    public int uniquePaths(int m, int n) {
        if(m ==1 || n == 1) return 1;
        return uniquePaths(m - 1,n) + uniquePaths(m, n -1 );
    }

    // Run Time 0ms time
    public int uniquePathsDP(int m, int n) {
        int[][] mat = new int[m][n];
        for (int i = 0; i< m; i++){
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0){
                    mat[i][j] = 1;
                } else {
                    mat[i][j] = mat[i-1][j] + mat[i][j-1];
                }

            }
        }
        return mat[m-1][n-1];

        //return uniquePaths(m - 1,n) + uniquePaths(m, n -1 );
    }
}
