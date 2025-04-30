class Solution {
    static int check(int num){
        int dig=0;
        while(num>0){
            num=num/10;
            dig++;
        }
        return dig;
    }
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int num:nums){
            int count=check(num);
                if(count%2==0){
                    ans++;
                }
            }        
        return ans;
    }
}