import java.util.*;

public class Cyclecheck {

    static class Edge implements Comparable<Edge> {
        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static void main(String[] args) {
        List<Edge>[] graph = new ArrayList[5];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 2));
        graph[1].add(new Edge(1, 3, 3));
        graph[2].add(new Edge(2, 4, 4));
        graph[3].add(new Edge(3, 4, 5));



        Cyclecheck mstPrims = new Cyclecheck();
        mstPrims.findMST(graph);
    }

    public void findMST(List<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        int startNode = 0;

        int[] parent = new int[graph.length];
        Arrays.fill(parent, 0);

        pq.add(new Edge(startNode, startNode, 0));

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();

            int u = cur.destination;

            if (vis[u]) {
                System.out.println("Cycle detected at node " + u);
            } else {
                System.out.println("Visiting node " + u);
                vis[u] = true;
            }

            for (Edge edge : graph[u]) {
                int v = edge.destination;
                if (!vis[v]) {
                    parent[v] = u;
                    pq.add(edge);
                } else if (parent[u] != v) {
                    System.out.println("Cycle detected between " + u + " and " + v);
                }
            }
        }
    }
}
