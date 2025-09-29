class Solution {
    int[][] t;
    int n;
    
    public int minScoreTriangulation(int[] values) {
        n = values.length;
        t = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(t[i], -1);
        }
        return solve(values, 0, n - 1);
    }

    private int solve(int[] values, int i, int j) {
        // No triangle possible if less than 3 vertices
        if (j - i < 2) return 0;

        if (t[i][j] != -1) return t[i][j];

        int ans = Integer.MAX_VALUE;

        // Try all possible partitions
        for (int k = i + 1; k < j; k++) {
            int score = values[i] * values[j] * values[k] 
                        + solve(values, i, k) 
                        + solve(values, k, j);
            ans = Math.min(ans, score);
        }

        return t[i][j] = ans;
    }
}
