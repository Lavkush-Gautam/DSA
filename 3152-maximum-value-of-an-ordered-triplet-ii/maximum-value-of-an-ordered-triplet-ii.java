class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long result = 0, maxDiff = 0;
        int maxVal = 0;
        for (int num : nums) {
            result = Math.max(result, maxDiff * num);
            maxDiff = Math.max(maxDiff, maxVal - num);
            maxVal = Math.max(maxVal, num);
        }
        return result;
    }
}
