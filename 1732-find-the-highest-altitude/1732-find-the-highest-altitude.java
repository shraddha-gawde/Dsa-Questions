class Solution {
    public int largestAltitude(int[] gain) {
        
        int n=gain.length;
        
        int max_so_far=0;
        int max =0;
        
        for(int i=0;i<n;i++)
        {
            max_so_far+=gain[i];
            max=Math.max(max,max_so_far);
        }
        return max;
    }
}