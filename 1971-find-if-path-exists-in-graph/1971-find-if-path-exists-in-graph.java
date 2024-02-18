class Solution 
{
    public boolean validPath(int n, int[][] edges, int source, int destination) 
    {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)    
        {
           adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        Queue<Integer>q=new LinkedList<>();
        q.add(source);
        boolean flag=false;
        boolean vis[]=new boolean[n+1];
        vis[source]=true;
        //System.out.print(adj);
        while(!q.isEmpty())
        {
            int node=q.peek();
          //  System.out.println(node);
            q.poll();
            if(node==destination)
           { 
               flag=true;
               break;
            }
            for(Integer it:adj.get(node))
            {
                if(vis[it]==false)
                {
                   q.add(it);
                   vis[it]=true;
                }
            }
        }
        return flag;
    }
}