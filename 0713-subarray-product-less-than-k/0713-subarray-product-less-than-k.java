class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int s = 0, e = 0, prod = 1, ans = 0;
        while(e < nums.length) {
            prod *= nums[e++];
            while(s < e && prod >= k) {
                prod /= nums[s++];
            }
            if(prod < k) {
                ans += e-s; 
            }
        }
        return ans;
    }
}