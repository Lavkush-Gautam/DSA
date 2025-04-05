class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int num:nums){
            res|=num;
        }
        return res<<(n-1);
        
    }
}