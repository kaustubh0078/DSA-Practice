package Lecture47;

public class GraphClient {
    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.addEdge(1, 2, 10);
        g.addEdge(1, 3, 20);
        g.addEdge(3, 4, 30);
        g.addEdge(4, 2, 40);
        g.addEdge(5, 2, 50);
        g.addEdge(5, 6, 60);
        g.addEdge(7, 6, 60);
        g.addEdge(7, 5, 70);

        g.PrintAllPath(1,7);
    }
}
