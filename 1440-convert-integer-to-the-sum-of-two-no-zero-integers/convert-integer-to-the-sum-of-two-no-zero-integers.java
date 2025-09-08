class Solution {
    boolean check(int a) {
        while (a > 0) {
            if (a % 10 == 0) return false;
            a /= 10;
        }
        return true;
    }
    
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if (check(i) && check(n - i)) {
                return new int[]{i, n - i};
            }
        }
        return new int[0];  
    }
}
