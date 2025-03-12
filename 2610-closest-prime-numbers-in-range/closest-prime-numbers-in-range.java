class Solution {
    private boolean[] sieve(int r){
        boolean []isPrime=new boolean[r+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=r;i++){
            if(isPrime[i]){
                for(int j=2;i*j<=r;j++){
                    isPrime[i*j]=false;
                }
            }
        }
        return isPrime;
    }
    public int[] closestPrimes(int left, int right) {
        boolean []isPrime=sieve(right);
        List<Integer>ls=new ArrayList<>();
        for(int num=left;num<=right;num++){
            if(isPrime[num]){
                ls.add(num);
            }
        }
        int minDif=Integer.MAX_VALUE;
        int []res={-1,-1};
        for(int i=1;i<ls.size();i++){
            int dif=ls.get(i)-ls.get(i-1);
            if(dif<minDif){
                minDif=dif;
                res[0]=ls.get(i-1);
                res[1]=ls.get(i);
            }
        }
        return res;
    }
}