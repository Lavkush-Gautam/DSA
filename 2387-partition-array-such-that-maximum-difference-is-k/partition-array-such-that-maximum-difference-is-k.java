class Solution {
    public int partitionArray(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=1;
        int minV=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]-minV>k){
                count++;
                minV=nums[i];
            }

        }
        return count;
    }
}