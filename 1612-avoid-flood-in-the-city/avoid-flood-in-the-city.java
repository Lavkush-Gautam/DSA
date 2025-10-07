
class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        
        // Map from lake → last day it got rained on
        Map<Integer, Integer> lastRain = new HashMap<>();
        // TreeSet of indices of dry days available
        TreeSet<Integer> availableDays = new TreeSet<>();
        
        for (int i = 0; i < n; i++) {
            int lake = rains[i];
            if (lake > 0) {
                // Rainy day
                if (lastRain.containsKey(lake)) {
                    int prevDay = lastRain.get(lake);
                    // Find a dry day > prevDay
                    Integer dryDay = availableDays.higher(prevDay);
                    if (dryDay == null) {
                        // No available dry day to prevent flood
                        return new int[0];
                    }
                    // We dry this lake on that day
                    ans[dryDay] = lake;
                    // Remove that dry day from availability
                    availableDays.remove(dryDay);
                }
                
                lastRain.put(lake, i);
                
            } else {
    
                availableDays.add(i);
                
                ans[i] = 1;
            }
        }
        
        
        for (int d : availableDays) {
            ans[d] = 1;
        }
        
        return ans;
    }
}
