class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[]count=new int[100];
        int res=0;
        for(int[]d:dominoes){
            int a=d[0],b=d[1];
            if(a>b){
                int temp=a;
                a=b;
                b=temp;
            }
            int num=a*10+b;
            res+=count[num]++;
        }
        return res;
        
    }
}