class Solution {
    public int compress(char[] chars) {
        
        int run = 0;
        int right = 0;
        
        while (right < chars.length) {
            int left = right;
            while (right < chars.length && chars[left] == chars[right]){
                right++;
            }
            
            chars[run++] = chars[left];
            
            if (right - left != 1){
                
                var s = String.valueOf(right - left);
                
                for (var v : s.toCharArray()){
                    chars[run++] = v;
                }
            }
        }
        return run;
    }
}
