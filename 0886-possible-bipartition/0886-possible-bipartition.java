class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
          if(dislikes.length == 0) return true;
          HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
          for(int i = 1 ; i <= n ; i++){
              map.put(i,new ArrayList<Integer>());
          }
          for(int[] d : dislikes){
              map.get(d[0]).add(d[1]);
          }
          int[] color = new int[n+1];
          for(int i = 0 ; i < n+1 ; i++){
              color[i] = -1;
          }
          Queue<Integer> que = new ArrayDeque<>();

         for(int j = 1 ; j <= n ; j++){ 
             que.offer(j);
          while(!que.isEmpty()){
              int v = Integer.valueOf(que.poll());
              if(color[v] == -1) color[v] = v;
            
              for(int i = 0 ; i < map.get(v).size() ; i++){
                  if(color[map.get(v).get(i)] == -1){
                     color[map.get(v).get(i)] = 1 - color[v]; 
                     que.offer(map.get(v).get(i));
                  }
                  else if(color[map.get(v).get(i)] == color[v]) return false;
               }
       
          }
         }
          return true;
    }
}