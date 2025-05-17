class Solution {
    
    public void sortColors(int[] nums) {
       int n=nums.length;
       int i=0;
       int j=0;
       int k=n-1;
       while(j<=k){
        if(nums[j]==1){
            j++;
        }
        else if(nums[j]==2){
            int x=nums[j];
            nums[j]=nums[k];
            nums[k]=x;
            k--;
        }
        else{
            int x=nums[i];
            nums[i]=nums[j];
            nums[j]=x;
            i++;
            j++;
        }
       }
    }
}