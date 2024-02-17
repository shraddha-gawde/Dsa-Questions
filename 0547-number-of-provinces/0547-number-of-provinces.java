class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=0;
        for(int j=0;j<isConnected[0].length;j++){
            n += dfs(isConnected, j);
        }
        return n;
    }

    private int dfs(int[][] isConnected, int node){
        if(isConnected[node][node]==0)
            return 0;

        isConnected[node][node]=0;
        for(int j=0;j<isConnected[node].length;j++){
            if(isConnected[node][j]==1){
                dfs(isConnected,j);
            }
        }
        return 1;
    }
}