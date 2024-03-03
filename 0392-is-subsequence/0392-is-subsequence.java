class Solution {
    public boolean isSubsequence(String s, String t) {
    
        int i = 0;
        int j = 0;
        
        int n=t.length();
        int m=s.length();
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        if(m < 1){
            return true;
        }
        

        while(i < n){
            if(tArray[i]==sArray[j]){
                j++;
            }
            i++;
        
            if(j == m){
                return true;
            }
        }
        return false;
    }
}