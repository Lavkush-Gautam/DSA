class Solution {
    private final int M=1000000007;
    public int lengthAfterTransformations(String s, int t) {
        int[]map=new int[26];
        for(char ch:s.toCharArray()){
            map[ch-'a']++;
        }
        for(int c=1;c<=t;c++){
            int []temp=new int[26];
            for(int i=0;i<26;i++){
                char ch=(char)(i+'a');
                int freq=map[i];
                if(ch!='z'){
                    temp[(ch+1)-'a']=(temp[(ch+1)-'a']+freq)%M;

                }
                else{
                    temp['a'-'a']=(temp['a'-'a']+freq)%M;
                    temp['b'-'a']=(temp['b'-'a']+freq)%M;
                }
            }
            map=temp;
        }
        int res=0;
        for(int i=0;i<26;i++){
            res=(res+map[i])%M;
        }
        return res;
    }
}