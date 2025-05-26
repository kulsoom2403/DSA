import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class May_26 {

        public int largestPathValue(String colors, int[][] edges) {
            int n = colors.length();
            int [] indegree = new int[n];
            List<Integer>[] adj = new ArrayList[n];
            for(int i=0; i<n; i++)
                adj[i]  = new ArrayList();

            int dp[][] = new int[n][26];
            Queue<Integer> q = new LinkedList<Integer>();

            for(int d[] : edges)
            {
                adj[d[0]].add(d[1]);
                indegree[d[1]]++;
            }

            for(int i=0; i<n; i++)
            {
                if(indegree[i]==0)
                    q.add(i);
            }
            int seen = 0;
            int ans = 0;
            while(!q.isEmpty())
            {
                int u = q.poll();
                seen++;
                int c = colors.charAt(u) - 'a';
                dp[u][c]++;
                ans = Math.max(ans, dp[u][c]);

                for(int v : adj[u])
                {
                    indegree[v]--;
                    for(int k=0; k<26; k++)
                        dp[v][k] = Math.max(dp[u][k], dp[v][k]);
                    if(indegree[v]==0)
                        q.add(v);
                }

            }

            return seen == n ? ans : -1;



        }

    public static void main(String[] args) {
        String color ="ababa";
        int[][] edges ={{0,1},{0,2},{2,3},{3,4}};
        May_26 obj = new May_26();
        int result = obj.largestPathValue(color,edges);
        System.out.println(result);
    }

}
