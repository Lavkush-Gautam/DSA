import java.util.*;

class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        int[][] count = new int[n][26]; // count[i][c] = max frequency of color c at node i
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[n];

        // Initialize graph
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            indegree[v]++;
        }

        // Queue for Kahn's algorithm
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) queue.offer(i);
            count[i][colors.charAt(i) - 'a'] = 1; // Initialize with node's own color
        }

        int visited = 0;
        int result = 0;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            visited++;
            for (int v : graph.get(u)) {
                for (int c = 0; c < 26; c++) {
                    // Update color count at node v
                    int currColor = colors.charAt(v) - 'a';
                    int val = count[u][c] + (c == currColor ? 1 : 0);
                    count[v][c] = Math.max(count[v][c], val);
                }
                indegree[v]--;
                if (indegree[v] == 0) queue.offer(v);
            }

            // Update result with max color count at node u
            for (int c = 0; c < 26; c++) {
                result = Math.max(result, count[u][c]);
            }
        }

        return visited == n ? result : -1; // cycle detected if not all nodes visited
    }
}
