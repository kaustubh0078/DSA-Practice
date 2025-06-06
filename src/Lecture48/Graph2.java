package Lecture48;

import java.util.*;

public class Graph2 {
    private HashMap<Integer, HashMap<Integer,Integer>> graph;

    public Graph2(int v){
        graph = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            graph.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int w) {
        graph.get(v1).put(v2, w);
        graph.get(v2).put(v1, w);
    }

    public void addVertice(int v) {
        graph.put(v, new HashMap<>());
    }

    public boolean bfs(int src, int dest){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        q.add(src);

        while (!q.isEmpty()){
            int rv = q.poll();

            if (rv==dest){
                return true;
            }

            if (visited.contains(rv)){
                continue;
            }

            visited.add(rv);

            for (int nbrs: graph.get(rv).keySet()){
                if (!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }

    public boolean dfs(int src, int dest){
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();

        st.push(src);
        while (!st.isEmpty()){
            int rv = st.pop();

            if (rv == dest){
                return true;
            }

            if (visited.contains(rv)){
                continue;
            }

            visited.add(rv);

            for (int nbrs : graph.get(rv).keySet()){
                if (!visited.contains(nbrs)){
                    st.push(nbrs);
                }
            }
        }
        return false;
    }

    public void DFT(){
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();

        for (int src : graph.keySet()){
            if (visited.contains(src)){
                continue;
            }
            st.push(src);
            while (!st.isEmpty()){
                int rv = st.pop();

                if (visited.contains(rv)){
                    continue;
                }
                visited.add(rv);
                System.out.print(rv+" ");
                for (int nbr : graph.get(rv).keySet()){
                    if (!visited.contains(nbr)){
                        st.push(nbr);
                    }
                }
            }
        }
    }
    public void BFT(){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        for (int src : graph.keySet()){
            if (visited.contains(src)){
                continue;
            }
            q.offer(src);
            while (!q.isEmpty()){
                int rv = q.poll();
                if (visited.contains(rv)){
                    continue;
                }
                visited.add(rv);
                System.out.print(rv+" ");
                for (int nbr : graph.get(rv).keySet()){
                    if (!visited.contains(nbr)){
                        q.offer(nbr);
                    }
                }
            }
        }
    }

    public boolean isConnected(){
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        int count = 0;

        for (int src : graph.keySet()){
            if (visited.contains(src)){
                continue;
            }
            st.push(src);
            count++;
            while (!st.isEmpty()) {
                int rv = st.pop();
                if (visited.contains(rv)) {
                    continue;
                }
                visited.add(rv);
                for (int nbr : graph.get(rv).keySet()) {
                    if (!visited.contains(nbr)) {
                        st.push(nbr);
                    }
                }
            }
        }
        return count == 1;
    }
    public int countComponents(){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int count = 0;

        for (int src : graph.keySet()){
            if (visited.contains(src)){
                continue;
            }
            q.offer(src);
            count++;
            while (!q.isEmpty()){
                int rv = q.poll();
                if (visited.contains(rv)){
                    continue;
                }
                visited.add(rv);
                for (int nbr : graph.get(rv).keySet()){
                    if (!visited.contains(nbr)){
                        q.offer(nbr);
                    }
                }
            }
        }
        return count;
    }
    public boolean isCyclic(){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        for (int src: graph.keySet()){
            if (visited.contains(src)){
                continue;
            }
            q.offer(src);
            while (!q.isEmpty()){
                int rv = q.poll();
                if (visited.contains(rv)){
                    return true;
                }
                visited.add(rv);
                for (int nbr : graph.get(rv).keySet()){
                    if (!visited.contains(nbr)){
                        q.offer(nbr);
                    }
                }
            }
        }
        return false;
    }
    public boolean isTree(){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int count = 0;

        for (int src : graph.keySet()){
            if (visited.contains(src)){
                continue;
            }
            q.offer(src);
            count++;
            while (!q.isEmpty()){
                int rv = q.poll();

                if (visited.contains(rv)){
                    return false;
                }
                visited.add(rv);
                for (int nbr : graph.get(rv).keySet()){
                    if (!visited.contains(nbr)){
                        q.offer(nbr);
                    }
                }
            }
        }
        return count==1;
    }
}
