class Solution {
    public int longestSubsequence(String s, int k) {
        int len=0;
        int preV=1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                len++;
            }
            else if(preV<=k){
                len++;
                k-=preV;
               
            }
            if(preV<=k){
                preV<<=1;
            }
        }
        return len;
    }
}