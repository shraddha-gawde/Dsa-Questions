class Solution {
    public String maximumOddBinaryNumber(String s) 
    {
        int len = s.length();

        if (len == 0) {
            return "";
        }

        int zeros=0;

        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)=='0')
            zeros++;
        }

        char[] neo = new char[len];
        neo[len-1]='1';

        for(int i=len-2;i>=0;i--)
        {
            if(zeros!=0)
            {
                neo[i]='0';
                zeros--;
            }
            else
            {
                neo[i]='1';
            }
        }

        String res = new String(neo);
        return res;
    }
}