class Solution {
    static final int M=(int)1e9+7;
    private long findPower(long a,long b){
        if(b==0) return 1;

        long half=findPower(a,b/2);
        long res=(half*half)%M;
        if(b%2==1){
            res=(res*a)%M;
        }
        return res;
    }
    public int countGoodNumbers(long n) {
        long odd=(n+1)/2;
        long even=n/2;
        long res=(findPower(5,odd)*findPower(4,even))%M;
        return (int)res;
        
    }
}