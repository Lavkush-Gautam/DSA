class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int N=n+k-1;
        int []ex=new int [n+k-1];
        System.arraycopy(colors,0,ex,0,n);
        for(int i=0;i<k-1;i++){
            ex[n+i]=colors[i];
        }

        int res=0;
        int i=0,j=1;

        while(j<N){
            if(ex[j]==ex[j-1]){
                i=j;
                j++;
                continue;
            }
            if(j-i+1==k){
                res++;
                i++;
            }
            j++;
        }
        return res;
        
    }
}