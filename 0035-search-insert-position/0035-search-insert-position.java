class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int counter = 0;
        int index = 0;

        while (index < nums.length) {
            
            if (nums[index] == target) {
                
                return counter;
            }
            else {
                if (nums.length == 1) {
                    if (nums[index] < target) {
                        return counter+1;
                    }
                    else {
                        return counter;
                    }
                }

                if (nums[index] < target) {
                    counter ++;
                }
            }
            index ++;
        }

        return counter;
    }
}