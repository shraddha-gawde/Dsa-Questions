class Solution {
    public int longestSubarray(int[] nums) {
        
        int k = 0;
        
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = nums.length - 1;
        
        while(k < nums.length && nums[k] == 1){
            k++;
        }
        if(k==nums.length){
            return k-1;
        }
        j = k + 1;
        while(j < nums.length){
            if(nums[j] != 1){
                max = Math.max(max,j - i - 1);
                i = k + 1;
                k = j;
            }
            j++;
        }
        return Math.max(max,j - i - 1);
    }
}