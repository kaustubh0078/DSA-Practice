package Lecture48;

public class Graph2Client {
    public static void main(String[] args) {
        Graph2 g = new Graph2(7);
        g.addEdge(1, 2, 10);
        g.addEdge(1, 3, 20);
		g.addEdge(3, 4, 30);
        g.addEdge(4, 2, 40);
        g.addEdge(5, 2, 50);
        g.addEdge(5, 6, 60);
		g.addEdge(7, 6, 60);
        g.addEdge(7, 5, 70);

//        System.out.println(g.bfs(1,7));
//        System.out.println(g.dfs(1,7));
//        g.DFT();
//        g.BFT();
        System.out.println(g.isTree());
    }
}
