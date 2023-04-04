public class NumberofIslands_200 {

    int m, n, count = 0;
    char[][] grid;

    public int numIslands(char[][] grid1) {
        this.grid = grid1;
        m = grid.length;
        n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    visitedNode(i, j);
                }
            }
        }

        return count;
    }

    public void visitedNode(int i, int j) {
        if (grid[i][j] == '1') {
            grid[i][j] = '2';
            if (j - 1 >= 0)
                visitedNode(i, j - 1);
            if (j + 1 < n)
                visitedNode(i, j + 1);
            if (i - 1 >= 0)
                visitedNode(i - 1, j);
            if (i + 1 < m)
                visitedNode(i + 1, j);
        }
    }
}
