class Solution {
    public int numRabbits(int[] ans) {
        int n=ans.length;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int x:ans){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        int total=0;
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            int x=entry.getKey();
            int count=entry.getValue();

            int groupSize=x+1;
            int group=(int)Math.ceil((double)count/groupSize);
            total+=group*groupSize;
        }
        return total;
    }
}