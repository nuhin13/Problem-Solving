public class NumberofClosedIslands_1254 {
    int m, n, count = 0;
    boolean flag = true;
    int[][] grid;

    public int closedIsland(int[][] grid1) {
        this.grid = grid1;
        m = grid.length;
        n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    visitedNode(i, j);

                    if (flag) count++;
                    flag = true;
                }
            }
        }

        return count;
    }

    public void visitedNode(int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 1)
            return;

        if ((i == 0 || j == 0 || i == m - 1 || j == n - 1) && grid[i][j] == 0)
            flag = false;

        grid[i][j] = 1;

        visitedNode(i, j - 1);
        visitedNode(i, j + 1);
        visitedNode(i - 1, j);
        visitedNode(i + 1, j);
    }
}
