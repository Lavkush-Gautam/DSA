class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int i=0;
        int j=0;
        int op=k;
        int w=0;
        while(j<n){
            if(blocks.charAt(j)=='W'){
                w++;
            }
            if(j-i+1==k){
                op=Math.min(op,w);

                if(blocks.charAt(i)=='W'){
                    w--;
                }
                i++;
            }
            j++;
        }
        return op;
    }
}