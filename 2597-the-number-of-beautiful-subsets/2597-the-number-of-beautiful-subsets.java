class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        
        // Iterate over all possible subsets using bitmasks
        for (int mask = 1; mask < (1 << n); mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }
            
            if (isBeautiful(subset, k)) {
                count++;
            }
        }
        
        return count;
    }

    private boolean isBeautiful(List<Integer> subset, int k) {
        Set<Integer> seen = new HashSet<>();
        for (int num : subset) {
            if (seen.contains(num - k) || seen.contains(num + k)) {
                return false;
            }
            seen.add(num);
        }
        return true;
    }
}