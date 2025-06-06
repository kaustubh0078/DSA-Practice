package Lecture48;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
    public class bipair{
        int v;
        int d;
        public bipair(int v, int d){
            this.v = v;
            this.d = d;
        }
    }

    public boolean isBipartite(int[][] graph) {
        Queue<bipair> q = new LinkedList<>();
        HashMap<Integer,Integer> visited = new HashMap<>();

        for (int i = 0; i<=graph.length-1;i++){
            if (visited.containsKey(i)){
                continue;
            }
            q.offer(new bipair(i,0));
            while (!q.isEmpty()){
                bipair rv = q.poll();
                if (visited.containsKey(rv.v)){
                    if (visited.get(rv.v)!=rv.d){
                        return false;
                    }
                }
                visited.put(rv.v, rv.d);
                for (int nbr : graph[rv.v]){   //graph[0],graph[1]...
                    if (!visited.containsKey(nbr)){
                        q.offer(new bipair(nbr,rv.d+1));
                    }
                }
            }
        }
        return true;
    }
}
