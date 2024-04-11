class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        helper(nums,0,new ArrayList<>());
        return result;
    }
    public void helper(int []arr,int start,List<Integer> templist){
        if(templist.size()==arr.length){
            result.add(new ArrayList<>(templist));
            return;
        }else if(templist.size()<arr.length){
        for(int i=0;i<arr.length;i++){
            if((i>0 && arr[i]!=arr[i-1])||i==0){
                if(arr[i]!=-999){
                    templist.add(arr[i]);
                    int temp=arr[i];
                    arr[i]=-999;
                    helper(arr,i,templist);
                    arr[i]=temp;
                    templist.remove(templist.size()-1);
                }
            }
        }
        }
    }
}