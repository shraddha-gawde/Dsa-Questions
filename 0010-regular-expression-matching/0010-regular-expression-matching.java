class Solution {
    
    public boolean isMatch(String s, String p) {
        
        boolean[][] isMatch = new boolean[s.length() + 1][p.length() + 1];
        isMatch[s.length()][p.length()] = true;

        for (int i = s.length(); i >= 0; --i) {
            
            for (int j = p.length() - 1; j >= 0; --j) {
                
                if (p.charAt(j) == '*') {
                    isMatch[i][j] = isMatch[i][j + 1];
                    
                    if (i < s.length() && (s.charAt(i) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
                        isMatch[i][j] = isMatch[i][j] || isMatch[i+1][j+1] || isMatch[i+1][j];
                    }
                    isMatch[i][j-1] = isMatch[i][j];
                    --j; 
                } 
                else if (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {
                    isMatch[i][j] = isMatch[i+1][j+1];
                }
            }   
        }
        return isMatch[0][0];
    }
}