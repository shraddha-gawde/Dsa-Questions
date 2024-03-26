class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int c = nums[i] - 1;

            if (nums[i] > 0 && c < n) {
                if (nums[i] != nums[c]) {
                    int temp = nums[i];
                    nums[i] = nums[c];
                    nums[c] = temp;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }

        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}