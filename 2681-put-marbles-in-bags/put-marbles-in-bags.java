class Solution {
    public long putMarbles(int[] weights, int k) {
        int n=weights.length;
        int []pairSum=new int[n-1];
        for(int i=0;i<n-1;i++){
            pairSum[i]=weights[i]+weights[i+1];
        }
        Arrays.sort(pairSum);
        long maxS=0;
        long minS=0;
        for(int i=0;i<k-1;i++){
            minS+=pairSum[i];
              maxS+=pairSum[n-i-2];
        }

return maxS-minS;
    }
}