class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int n = nums.length;
        
        int i = 0;
        int j = 0;
        
        int max = Integer.MIN_VALUE;
        
        while(j < n){
            if(nums[j] == 0){
                k--;
            }
            while(k < 0){
                if(nums[i] == 0){
                    k++;
                }
                i++;
            }
            max = Math.max(max,j - i + 1);
            j++;
        }
        return max;
    }
}