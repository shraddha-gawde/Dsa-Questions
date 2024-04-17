class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        helper(n,k,result,cur);

        return result;

    }


    public static void helper(int n,int k,List<List<Integer>> result,List<Integer> cur){

        if(k==0){
            result.add(new ArrayList(cur));
            return;
        }

        if(n==0){
            return;
        }

        //take
        cur.add(n);
        helper(n-1,k-1,result,cur);
        cur.remove(cur.size()-1);

        //not
        helper(n-1,k,result,cur);
    
    }
}