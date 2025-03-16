class Solution {
    private boolean isPossible(int[] ranks,long mid, long cars){
        long carsRep=0;
        for(int rank:ranks){
            carsRep+=Math.sqrt(1.0*mid/rank);
        }
        return carsRep>=cars;

    }
    public long repairCars(int[] ranks, int cars) {
        int n=ranks.length;
        long l=1;
        long r=1L*cars*cars*Arrays.stream(ranks).max().orElse(Integer.MIN_VALUE);
        while(l<r){
            long mid=l+(r-l)/2;
            if(isPossible(ranks,mid,cars)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}