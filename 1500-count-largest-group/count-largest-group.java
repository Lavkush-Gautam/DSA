class Solution {
    static int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int mx=0;
        int count=0;
        for(int i=1;i<=n;i++){
            int ds=sum(i);
            mp.put(ds,mp.getOrDefault(ds,0)+1);
            if(mp.get(ds)==mx){
                count++;
            }else if(mp.get(ds)>mx){
                mx=mp.get(ds);
                count=1;
            }
        }
        return count;
    }
}