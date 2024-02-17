class Solution {
    public long countPairs(int n, int[][] edges) {
        ArrayList<Integer>[] neighbors = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            neighbors[i] = new ArrayList<>();
        }
        for (var edge: edges) {
            neighbors[edge[0]].add(edge[1]);
            neighbors[edge[1]].add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        long sum = 0, squaresum = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                long ans = (long) dfs(i, neighbors, visited);
                sum += ans;
                squaresum += ans * ans;
            }
        }

        return (sum * sum - squaresum) / 2;
    }

    private long dfs(int node, ArrayList<Integer>[] neighbors, boolean[] visited) {
        visited[node] = true;
        int ans = 1;

        for (var neighbor: neighbors[node]) {
            if (!visited[neighbor]) {
                ans += dfs(neighbor, neighbors, visited);
            }
        }

        return ans;
    }
}