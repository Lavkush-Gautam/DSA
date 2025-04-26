class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {

        long min=-1;
        long max=-1;
        long chor=-1;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                chor=i;
            }
            if(nums[i]==minK){
                min=i;
            }
            if(nums[i]==maxK){
                max=i;
            }

            long smaller=Math.min(min,max);
            long temp=smaller-chor;

            if(temp<=0){
                ans+=0;
            }
            else{
                 ans+=temp;
            }
           
        }
        return ans;
    }
}