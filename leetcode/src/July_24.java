import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class July_24 {

        int[] parent;
        List<Integer>[] graph;
        int[] xor;
        int[] nums;

        public int minimumScore(int[] nums, int[][] edges) {
            this.nums = nums;
            int n = nums.length;
            parent = new int[n];
            xor = new int[n];
            Arrays.fill(parent, -1);
            graph = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int[] edge : edges) {
                graph[edge[0]].add(edge[1]);
                graph[edge[1]].add(edge[0]);
            }
            fillParent(0);
            int res = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                res = Math.min(res, solve(i));
            }
            return res;
        }

        void fillParent(int v) {
            for (int nei : graph[v]) {
                if (nei != 0 && parent[nei] == -1) {
                    parent[nei] = v;
                    fillParent(nei);
                }
            }
            xor[v] = nums[v];
            for (int nei : graph[v]) {
                if (parent[v] != nei) {
                    xor[v] ^= xor[nei];
                }
            }
        }

        int solve(int removed) {
            int n = graph.length;
            boolean[] inSubtree = new boolean[n];
            visit(removed, inSubtree);
            boolean[] inParentPath = new boolean[n];
            int v = removed;
            while (parent[v] != -1) {
                v = parent[v];
                inParentPath[v] = true;
            }
            int res = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                if (inSubtree[i]) {
                    continue;
                }
                int opt1, opt2, opt3;
                if (inParentPath[i]) {
                    opt1 = xor[removed];
                    opt2 = xor[i] ^ xor[removed];
                    opt3 = xor[0] ^ xor[i];
                } else {
                    opt1 = xor[removed];
                    opt2 = xor[i];
                    opt3 = xor[0] ^ xor[i] ^ xor[removed];
                }
                res = Math.min(res, Math.max(opt1, Math.max(opt2, opt3)) - Math.min(opt1, Math.min(opt2, opt3)));
            }
            return res;
        }

        void visit(int v, boolean[] visited) {
            visited[v] = true;
            for (int nei : graph[v]) {
                if (parent[v] != nei) {
                    visit(nei, visited);
                }
            }
        }

    public static void main(String[] args) {
        int[] arr = {1,5,5,4,11};
        int[][] num = {{0,1},{1,2},{1,3},{3,4}};

        July_24 obj = new July_24();
        int result = obj.minimumScore(arr,num);
        System.out.println(result);
    }

}
