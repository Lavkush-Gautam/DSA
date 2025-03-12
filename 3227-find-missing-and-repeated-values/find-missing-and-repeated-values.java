class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        int a=-1;
        int b=-1;
        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               mp.put(grid[i][j], mp.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int i=1;i<=size;i++){
            if(!mp.containsKey(i)){
                b=i;
            } else if(mp.get(i)==2){
                a=i;
            }
            if(a!=-1 && b!=-1){
                break;
            }
        }
        return new int[]{a,b};
    }
}