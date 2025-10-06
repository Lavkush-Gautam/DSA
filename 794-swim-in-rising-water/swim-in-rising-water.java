
class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        boolean[][] visited = new boolean[n][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{grid[0][0], 0, 0});
        visited[0][0] = true;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int elevation = curr[0], x = curr[1], y = curr[2];

            // If we've reached the bottom-right corner, return the current elevation
            if (x == n - 1 && y == n - 1) {
                return elevation;
            }

            // Explore the 4 neighbors
            for (int[] dir : dirs) {
                int nx = x + dir[0], ny = y + dir[1];
                if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    pq.offer(new int[]{Math.max(elevation, grid[nx][ny]), nx, ny});
                }
            }
        }

        return -1; 
    }
}
