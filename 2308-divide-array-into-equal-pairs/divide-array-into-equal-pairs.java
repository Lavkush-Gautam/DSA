class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length/2;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int count=0;
        for (Integer value : mp.values()) {
            count+=value/2;
                  }
                  return count==n;
    }
}