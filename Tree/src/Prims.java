import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Prims {

    static class Edge implements Comparable<Edge> {
        int weight;
        int source;
        int destination;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge a) {
            return this.weight - a.weight;
        }
    }

    public static void main(String[] args) {

        List<Edge>[] graph = new ArrayList[5];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 20));
        graph[1].add(new Edge(1, 3, 30));
        graph[1].add(new Edge(1, 2, 40));
        graph[2].add(new Edge(2, 3, 50));
        graph[2].add(new Edge(2, 4, 80));
        graph[3].add(new Edge(3, 4, 60));
        graph[4].add(new Edge(4, 0, 70));

        Prims prims = new Prims();
        prims.primsMST(graph);
    }

    public void primsMST(List<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        int startNode = 0;
        pq.add(new Edge(startNode, startNode, 0));

        int ans = 0;
        while (!pq.isEmpty()) {

            Edge cur = pq.poll();

            int u = cur.destination;//1

            if (vis[u]) {
                continue;
            }

            ans =ans+ cur.weight;
            vis[u] = true;

            for (Edge edge : graph[u]) {
                if (!vis[edge.destination]) {
                    pq.add(edge);
                }
            }
        }

        System.out.println("Minimum spanning tree weight: " + ans);
    }
}
