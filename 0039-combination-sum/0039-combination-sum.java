class Solution {
     public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        solve(0,candidates,target,l,l1);
        return l;
    }
    
    public void solve(int ind, int[] arr, int target, List<List<Integer>> l, List<Integer> l1){
        if(ind==arr.length){
            if(target==0){
                l.add(new ArrayList<>(l1));
            }
            return;
        }

        if(arr[ind]<=target){
            l1.add(arr[ind]);
            solve(ind,arr,target-arr[ind],l,l1);
            l1.remove(l1.size()-1);
        }
        solve(ind+1,arr,target,l,l1);
    }
   
}