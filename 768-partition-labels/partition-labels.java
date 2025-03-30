class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        List<Integer>res=new ArrayList<>();
        int []last=new int[26];
        for(int i=0;i<n;i++){
            last[s.charAt(i)-'a']=i;
        }

        int i=0;
        int start=0;
        int end=0;
        while(i<n){
            end=Math.max(end,last[s.charAt(i)-'a']);
            if(i==end){
                res.add(end-start+1);
                start=end+1;
            }
            i++;
        }
        return res;

        
    }
}