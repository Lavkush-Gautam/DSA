class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        int res=0;
        int end=0;
        for(int meet[]:meetings){
            if(meet[0]>end){
                res+=meet[0]-end-1;
            }
            end=Math.max(end,meet[1]);
        }
        if(days>end){
            res+=days-end;
        }
        return res;
    }
}