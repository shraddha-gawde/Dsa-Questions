class Solution {
  
   public static void backtrack(int[] nums,List<List<Integer>> ans,int index,List<Integer> temp){
    
   if(index >= nums.length){   
       ans.add(new ArrayList<>(temp));
        return;
}
    
        temp.add(nums[index]);
        backtrack(nums,ans,index+1,temp);
 
        temp.remove(temp.size()-1);
        backtrack(nums,ans,index+1,temp);

   

}

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
     
         backtrack(nums,ans,0,new ArrayList<>());
return ans;
    }
}