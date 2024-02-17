class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        
        int n = edges.length;
        HashSet<HashSet<Integer>> mainset = new HashSet<>();
        List<int[]> list = new ArrayList<>();

        HashSet<Integer> set7=new HashSet<>();
        set7.add(edges[0][0]);
        set7.add(edges[0][1]);
        mainset.add(set7);

        for(int i=1;i<n;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            HashSet<Integer> s1 = new HashSet<>();
            HashSet<Integer> s2 = new HashSet<>();
            boolean flag = true;
            for(HashSet<Integer> set: mainset){
                
                if(set.contains(u) && set.contains(v)){
                 flag=false;
                 break;
                }
                else if(set.contains(u)) s1 = set;
                else if(set.contains(v)) s2 = set;
            }
            if(flag==false){
              list.add(edges[i]);
              continue;
            }
          
            if(!s2.isEmpty()&& !s1.isEmpty()){
                HashSet<Integer> s3 = new HashSet<>();
                s3.addAll(s1);
                s3.addAll(s2);
                mainset.remove(s1);
                mainset.remove(s2);
                mainset.add(s3);
                continue;
            } 
            if(!s1.isEmpty()){
                HashSet<Integer> s4 = new HashSet<>();
                s4.addAll(s1);
                s4.add(v);
                mainset.remove(s1);
                mainset.add(s4);
                continue;
            }
             if(!s2.isEmpty()){
                HashSet<Integer> s5 = new HashSet<>();
                s5.addAll(s2);
                s5.add(u);
                mainset.remove(s2);
                mainset.add(s5);
                continue;
            }           
            if(s1.isEmpty() && s2.isEmpty()){           
                HashSet<Integer> set=new HashSet<>();
                set.add(u);
                set.add(v);
                mainset.add(set);
                continue;
            }


        }
        return list.size()>0 ? list.get(list.size()-1) : new int[]{};
    }
}