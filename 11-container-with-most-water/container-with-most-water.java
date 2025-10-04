class Solution {
    public int maxArea(int[] a) {
        int i = 0;
        int j = a.length- 1;
        int area = Integer.MIN_VALUE;
        while (i < j) {
            int h = Math.min(a[i], a[j]);
            int w = j - i;
            area = Math.max(area, w * h);
            if (a[i] < a[j]) {
                i++;
            } else {
                j--;
            }
        }
        return area;
    }
}