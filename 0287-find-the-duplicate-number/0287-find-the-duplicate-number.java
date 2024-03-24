class Solution {
    public int findDuplicate(int[] nums) {
        
        int result = nums[0];
        int temp = nums[0];

        do {
            result = nums[result];
            temp = nums[nums[temp]];
        } while (result != temp);

        
        result = nums[0];
        while (result != temp) {
            result = nums[result];
            temp  = nums[temp];
        }

        return result;
    }

}