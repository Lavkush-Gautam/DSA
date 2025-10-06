class Solution {
    public void setZeroes(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[][]temp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[i][j]=mat[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    for(int k=0;k<n;k++){
                        temp[i][k]=0;
                    }
                    for(int k=0;k<m;k++){
                        temp[k][j]=0;
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=temp[i][j];
            }
        }

        
    }
}