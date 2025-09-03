package Lecture47;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    private HashMap<Integer,HashMap<Integer,Integer>> graph;

    public Graph(int v){
        graph = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            graph.put(i,new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int w){
        graph.get(v1).put(v2,w);
        graph.get(v2).put(v1,w);
    }
    public void addVertices(int v){
        graph.put(v,new HashMap<>());
    }

    public void removeVertice(int v){
        for(int nbrs : graph.get(v).keySet()){
            graph.get(nbrs).remove(v);
        }
        graph.remove(v);
    }

    public void removeEdge(int v1, int v2){
        graph.get(v1).remove(v2);
        graph.get(v2).remove(v1);
    }

    public boolean containsVertice(int v){
        return graph.containsKey(v);
    }

    public boolean containsEdge(int v1, int v2){
        return graph.get(v1).containsKey(v2);
    }

    public void Display(){
        for (int v : graph.keySet()){
            System.out.println(v+" ==> "+graph.get(v));
        }
    }

    public boolean HasPath(int src, int dest){
        return hasPath(src, dest, new HashSet<>());
    }
    private boolean hasPath(int src, int dest, HashSet<Integer> visited){
        if (src == dest){
            return true;
        }
        visited.add(src);
        for (int nbrs: graph.get(src).keySet()){
            if (!visited.contains(nbrs)){
                boolean ans = hasPath(nbrs,dest,visited);
                if (ans == true){
                    return true;
                }
            }
        }
        return false;
    }
    private void printAllPath(int src, int dest, HashSet<Integer> visited, String s){
        if (src == dest){
            s+="End";
            System.out.println(s);
            return;
        }
        visited.add(src);
        for (int nbrs:graph.get(src).keySet()){
            if (!visited.contains(nbrs)){
                printAllPath(nbrs,dest,visited,s+nbrs+"==> ");
            }
        }
        visited.remove(src);
    }

    public void PrintAllPath(int src, int dest){
        printAllPath(src, dest, new HashSet<>(), src+" ==> ");
    }
}
