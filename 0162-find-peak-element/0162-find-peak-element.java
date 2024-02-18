class Solution {
    public int findPeakElement(int[] nums) {
       int s=0,e=nums.length-1,mid;
       while(s<e)
       {
           mid=(s+e)/2;
           if(nums[mid]<nums[mid+1])
           s=mid+1;
           else 
           e=mid;
       }
       return s;
    }
}