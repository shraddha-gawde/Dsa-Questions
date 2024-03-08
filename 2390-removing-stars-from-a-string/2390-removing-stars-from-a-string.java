class Solution {
    public String removeStars(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c : chars){
            if(c != '*'){
                stack.push(c);
            } 
            else {
                stack.pop();
            }
        }
        
        char[] res = new char[stack.size()];
        int i = res.length - 1;
        
        while(!stack.isEmpty()){
            res[i--] = stack.pop();
        }

        return new String(res);
    }
}