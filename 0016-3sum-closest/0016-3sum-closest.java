class Solution
{
    public int threeSumClosest(int[] nums, int target) 
    {
        Arrays.sort(nums);
        int sum=0;
        int temp=0;
        int temp1 = Integer.MAX_VALUE;
        int res=Integer.MAX_VALUE;
        int out=0;
        for (int i = 0; i < nums.length-1; i++){
           int j=i+1;
           int k= nums.length-1;
            
           while(j<k){
                sum = nums[i] + nums[j] + nums[k];
                temp = Math.abs((sum - target));
                if (temp < res){
                   res = temp;
                   out = sum; 
                }
                if (temp1<temp){
                   j++;
                   k= nums.length-1;
                   temp1=Integer.MAX_VALUE;
                }
                else{
                   k--;
                   temp1 = temp;
                }
            }
            if (out==target) {
               break;  
            }
        }
        return out;  
    }
}