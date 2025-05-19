class Solution {
    String check(int nums[]){
         if(nums[0]==nums[1] && nums[1]==nums[2]){
                return "equilateral";
            }
            else if(nums[0]==nums[1] || nums[0]==nums[2] || nums[1]==nums[2]){
                return "isosceles";
            }
            
            else{
                return "scalene";
            }
    }
    public String triangleType(int[] nums) {
    
           
           if(nums[0]+nums[1]>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0] ){
        String ans=check(nums);
        return ans;
           }
           else{
            return "none";
           }
     
        
    }
}