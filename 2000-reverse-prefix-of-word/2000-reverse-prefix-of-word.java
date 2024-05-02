class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        int firstOccurence = word.indexOf(ch);
        int k = 0;
        int l = firstOccurence;
        while(k<l){
            swap(sb,k,l);
            k++;
            l--;
        }
        return sb.toString();
    }
    void swap(StringBuilder sb,int i,int j){
        char temp = sb.charAt(i);
        sb. replace(i,i+1, ""+sb.charAt(j));
        sb. replace(j,j+1, ""+temp);
    }
}