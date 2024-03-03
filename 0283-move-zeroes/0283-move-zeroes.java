class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (nums.length == 1) {
            return;
        }

        int nonZero = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[nonZero] = nums[i];
                nonZero++;
            }
        }

       
         while(nonZero < n){
            nums[nonZero] = 0;
            nonZero++;
        }
    }
}