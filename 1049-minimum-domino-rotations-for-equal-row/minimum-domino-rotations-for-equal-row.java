class Solution {
    int find(int[]tops,int []bottoms,int val){
        int bottom=0;
        int top=0;
        int n=tops.length;

        for(int i=0;i<n;i++){
            if(bottoms[i]!=val && tops[i]!=val){
                return -1;
            }
            else if(tops[i]!=val){
                 top++;
            }
            else if(bottoms[i]!=val){
                bottom++;
            }
        }
        return Math.min(bottom,top);
    }
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int res=Integer.MAX_VALUE;
        for(int val=1;val<=6;val++){
        int swap=find(tops,bottoms,val);
        if(swap!=-1){
            res=Math.min(res,swap);
        }
        }
        
        return res==Integer.MAX_VALUE ? -1 :res;
        
    }
}