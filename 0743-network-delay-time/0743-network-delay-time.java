class Solution {
    private final static int MAX = 1_000_000_000;
    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] time = new int[n][n]; 
        
        for (var t : time){
           Arrays.fill(t, MAX); 
        } 
        for (int i = 0; i < n; i++){
            time[i][i] = 0;
        } 
        for (var t : times){
            time[t[0]-1][t[1]-1] = t[2];
        }  

        for (int m = 0; m < n; m++){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    if (time[i][m] + time[m][j] < time[i][j]){
                        time[i][j] = time[i][m] + time[m][j];
                    } 
                }
            
            } 
        } 

        int res = time[--k][0];
        for (var t : time[k]){
            if (t == MAX){
                return -1;  
            } 
            else if(t > res){
                 res = t;
            } 
        } 
        return res;
    }
}