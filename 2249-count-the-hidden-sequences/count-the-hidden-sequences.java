class Solution {
    public int numberOfArrays(int[] dif, int lower, int upper) {
        int curr=0;
        int minV=0;
         int maxV=0;

         for(int d:dif){
            curr+=d;
            minV=Math.min(minV,curr);
            maxV=Math.max(maxV,curr);

            if((upper-maxV)-(lower-minV)+1<=0){
                return 0;
            }
         }
        return (upper-maxV)-(lower-minV)+1;
    }
}