class Solution {
    public String pushDominoes(String dominoes) {
        String s="L"+dominoes+"R";
        int n=s.length();
        StringBuilder res=new StringBuilder();
        
        for(int i=0,j=1;j<n;j++){
            if(s.charAt(j)=='.')continue;
            int mid=j-i-1;
            if(i>0){
                res.append(s.charAt(i));
            }
            if(s.charAt(i)==s.charAt(j)){
                res.append(String.valueOf(s.charAt(i)).repeat(mid));
            }
           else if(s.charAt(i)== 'L' && s.charAt(j)=='R'){
                res.append(".".repeat(mid));
            }
            else{
                int half=mid/2;
                res.append("R".repeat(half));
                if(mid%2==1) res.append('.');
                res.append("L".repeat(half));
            }
            i=j;

        }
        return res.toString();
    }
}