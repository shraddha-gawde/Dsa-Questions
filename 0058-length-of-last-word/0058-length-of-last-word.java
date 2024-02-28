class Solution {
    public int lengthOfLastWord(String s){
        int n = s.length();
        int count = 0;
        for (int i = n - 1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                if(count > 0){
                    break;
                }
            } 
            else{
                count++;
            }
        }
        return count;
    }
}