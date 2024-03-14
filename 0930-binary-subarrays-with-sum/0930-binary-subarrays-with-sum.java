class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == goal){
                   count++; 
                } 
                if(sum > goal){
                    break;
                }
            }
            sum = 0;
        }
        return count;
    }
}