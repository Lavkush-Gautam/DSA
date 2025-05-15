class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
         List<String>ans=new ArrayList<>();
         for(int i=0;i<groups.length;i++){
            if(i==0 ||groups[i]!=groups[i-1]){
                ans.add(words[i]);
            }
         }
         return ans;
    }
}