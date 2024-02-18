class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n]; //0=nothing, 1=yellow, 2=blue
        boolean[] vis = new boolean[n];

        for(int i=0; i<n; i++) { //there is chanses to diff compnent so check for all
            if(!vis[i]){
                if(!dfs(graph, color, vis, 1, i)){
                    return false;
                }
            }
        }

        return true;
    }
    
    public boolean dfs(int[][] graph, int[] color, boolean[] vis, int curr, int i) {
        if(color[i] != 0 && color[i] != curr) {
            return false;
        }

        if(vis[i]) return true;
        vis[i] = true;

        color[i] = curr;
        int next = curr==1?2:1; //color for next vertex

        for(int j : graph[i]) {
            if(!dfs(graph, color, vis, next, j)) return false;
        }

        return true;
    }
}