class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[]t=new int[n];
        Arrays.fill(t,1);
        int[]pIdx=new int[n];
        Arrays.fill(pIdx,-1);
        int lastIdx=0;
        int mxL=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    if(t[i]<t[j]+1){
                    t[i]=t[j]+1;
                    pIdx[i]=j;
                    }
                    if(t[i]>mxL){
                        mxL=t[i];
                        lastIdx=i;

                    }
                }
            }
        }
        List<Integer>res=new ArrayList<>();
        while(lastIdx>=0){
            res.add(nums[lastIdx]);
            lastIdx=pIdx[lastIdx];
        }
return res;
        
    }
}