class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       if(arr.length==1){
           return true;
       } 
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(Integer num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set=new HashSet<>(map.values());
        return map.size()==set.size();
      
    }
}