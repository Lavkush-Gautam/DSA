class Solution {
    public long countSubarrays(int[] nums, int k) {
        int mx=Arrays.stream(nums).max().getAsInt();
        int n=nums.length;
        int i=0,j=0;
        long res=0;
        int count=0;
        while(j<n){
            if(nums[j]==mx){
                count++;
            }
            while(count>=k){
                res+=n-j;
                if(nums[i]==mx){
                    count--;
                }
                i++;
            }
            j++;
        }
        return res;
    }
}