
class Solution {
    private int[][] heights;
    private int m, n;
    private final int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights = heights;
        m = heights.length;
        n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        // Run DFS from Pacific and Atlantic borders
        for (int i = 0; i < m; i++) {
            dfs(i, 0, pacific);        // Left edge (Pacific)
            dfs(i, n - 1, atlantic);   // Right edge (Atlantic)
        }

        for (int j = 0; j < n; j++) {
            dfs(0, j, pacific);        // Top edge (Pacific)
            dfs(m - 1, j, atlantic);   // Bottom edge (Atlantic)
        }

        List<List<Integer>> result = new ArrayList<>();

        // Collect cells that can reach both oceans
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }

    private void dfs(int r, int c, boolean[][] visited) {
        visited[r][c] = true;

        for (int[] dir : directions) {
            int nr = r + dir[0];
            int nc = c + dir[1];

            if (nr < 0 || nc < 0 || nr >= m || nc >= n) continue;
            if (visited[nr][nc]) continue;
            if (heights[nr][nc] < heights[r][c]) continue; // Can't go uphill

            dfs(nr, nc, visited);
        }
    }
}
