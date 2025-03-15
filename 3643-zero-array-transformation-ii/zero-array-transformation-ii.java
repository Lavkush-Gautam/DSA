class Solution {
    private int n;
    private int q;
    private boolean checkDifArray(int []nums,int[][] queries,int k){
        int[]diff=new int[n];

        for(int i=0;i<=k;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int x=queries[i][2];

            diff[l]+=x;
            if(r+1<n){
                diff[r+1]-=x;
            }
        }

            int cumSum=0;
            for(int i=0;i<n;i++){
                cumSum+=diff[i];
                diff[i]=cumSum;

                if(nums[i]-diff[i]>0){
                    return false;
                }
            }
        return true;
    }
    public int minZeroArray(int[] nums, int[][] queries) {
        n=nums.length;
        q=queries.length;

        if(Arrays.stream(nums).allMatch(x->x==0)){
            return 0;
        }
        
        int l=0;
        int r=q-1;
        int k=-1;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(checkDifArray(nums,queries,mid)){
                k=mid+1;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return k;
    }
}