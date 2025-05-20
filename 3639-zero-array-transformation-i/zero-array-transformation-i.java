class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int d[]=new int[n];
        for(int que[]:queries){
            int s=que[0];
            int e=que[1];
            int x=1;
            d[s]+=x;
            if(e+1<n){
                d[e+1]-=x;
            }
        }
        int check=0;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            check+=d[i];
            res[i]=check;
        }
        for(int i=0;i<n;i++){
            if(nums[i]>res[i]){
                return false;
            }
        }
        return true;
    }
}