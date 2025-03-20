import java.util.*;

public class March_20 {

    private int findRoot(int[] parent, int node) {
        if (parent[node] != node) {
            parent[node] = findRoot(parent, parent[node]);
        }
        return parent[node];
    }

    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        int[] parent = new int[n];
        int[] minPathCost = new int[n];

        // Initialize Union-Find and minPathCost
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            minPathCost[i] = -1; // Initializing with -1 (no cost yet)
        }

        // Process all edges and union components
        for (int[] edge : edges) {
            int source = edge[0], target = edge[1], weight = edge[2];

            int root1 = findRoot(parent, source);
            int root2 = findRoot(parent, target);

            if (root1 != root2) {
                // Union the two components
                parent[root1] = root2;
                // Update the minimum path cost using AND operation
                if (minPathCost[root2] == -1) minPathCost[root2] = weight;
                else minPathCost[root2] &= weight;

                // If root1 had a cost associated, merge it
                if (minPathCost[root1] != -1) {
                    minPathCost[root2] &= minPathCost[root1];
                }
            }
        }

        // Answer the queries
        int[] result = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            int start = query[i][0], end = query[i][1];

            if (start == end) {
                result[i] = 0; // Same node, cost is 0
            } else if (findRoot(parent, start) != findRoot(parent, end)) {
                result[i] = -1; // Not connected
            } else {
                // Get the minimum path cost
                result[i] = minPathCost[findRoot(parent, start)];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        March_20 solution = new March_20();

        // Test case example:
        int n = 5;
        int[][] edges = {
                {0, 1, 3},
                {1, 2, 4},
                {2, 3, 6},
                {3, 4, 5}
        };
        int[][] query = {
                {0, 4},
                {1, 3},
                {2, 4}
        };

        int[] result = solution.minimumCost(n, edges, query);

        // Print the result
        System.out.println(Arrays.toString(result)); // Expected output [4, 4, 4] (example)
    }
}
