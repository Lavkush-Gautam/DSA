class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        IntPredicate lambdaP=num-> num > 0;
         IntPredicate lambdaN=num-> num < 0;

        int positiveC=(int)Arrays.stream(nums).filter(lambdaP).count();
       
        int negativeC=(int)Arrays.stream(nums).filter(lambdaN).count();

        return Math.max(positiveC,negativeC);

    }
}