class Solution {
    public int pivotInteger(int n) {
        int sum = (n * ( n + 1)) / 2;
        
        int i = 1;
        int j = n;

        while(i <= j){
            int mid = i + (j - i) / 2;
            int s = mid * mid;
            if(s == sum){
                return mid;
            } 
            else if(s>sum){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            } 
        }
        return -1;
    }
}