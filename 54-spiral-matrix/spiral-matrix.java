class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> l=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top = 0;
        int bottom = m- 1;
        int left = 0;
        int right = n - 1;

        while (top<= bottom && left<=right) {
            
            for (int i = left; i <= right; i++) {
               l.add(matrix[top][i]);
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                l.add(matrix[i][right]);
            }
            right--;

             if (top <= bottom) {
                // Traverse from right to left along the bottom row
                for (int i = right; i >= left; i--) {
                    l.add(matrix[bottom][i]);
                }
                bottom--;
            }

            
     if (left <= right) {
                // Traverse from bottom to top along the left column
                for (int i = bottom; i >= top; i--) {
                    l.add(matrix[i][left]);
                }
                left++;
     }
        }
        return l;
    }
}