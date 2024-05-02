class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int ans = -1;
        for(int num : nums){
            hs.add(num);
            int k = num*(-1);
            if(hs.contains(k)){
                ans = Math.max(ans,Math.abs(num));
            }
        }
        return ans;
    }
}