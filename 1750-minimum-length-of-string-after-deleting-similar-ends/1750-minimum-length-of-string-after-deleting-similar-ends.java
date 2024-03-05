class Solution {
    public int minimumLength(String s) 
    {
        int i = 0;
        int j = s.length() - 1;
        
        while(i < j){
            if(s.charAt(i)!=s.charAt(j)){
                break;
            }
            
            char ch=s.charAt(i);
            while(i <= j && s.charAt(i) == ch){
                i++;
            }
            
            while(i <= j && s.charAt(j) == ch){
                j--;
            }
            
        }
        return j - i + 1;
    }
}