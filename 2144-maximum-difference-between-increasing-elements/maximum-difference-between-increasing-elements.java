class Solution {
    public int maximumDifference(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j] && i<j){
                   int dif=nums[j]-nums[i];
                    ans=Math.max(ans,dif);
                }
            }
        }
        return ans==0 ? -1: ans;
    }
}