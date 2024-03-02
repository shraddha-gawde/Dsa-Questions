class Solution {
    public String reverseVowels(String s) {
        
        int i = 0;
        int j = s.length() - 1;
        
        char[] charArr = s.toCharArray();
        while (i < j) {
            
            if (checkVowel(charArr[i])) {
                
                while (i < j) {
                    if (checkVowel(charArr[j])) {
                        char temp = charArr[j];
                        charArr[j] = charArr[i];
                        charArr[i] = temp;
                        
                        j--;
                        
                        break;
                    }
                    j--;
                }
            }
            i++;
        }
        return new String(charArr);
    }

    public Boolean checkVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? true : false;

    }
}