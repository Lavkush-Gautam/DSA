import java.util.*;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);  // Sort to group close elements
        int n = nums.length;
        
        List<int[]> result = new ArrayList<>();
        
        for (int i = 0; i < n; i += 3) {
            int a = nums[i], b = nums[i + 1], c = nums[i + 2];
            
            if (c - a > k) {
                return new int[0][0];  // Invalid triplet
            }
            
            result.add(new int[]{a, b, c});
        }
        
        // Convert to 2D array
        return result.toArray(new int[result.size()][]);
    }
}
