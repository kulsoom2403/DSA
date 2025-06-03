public class June_3 {

        public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
            int count = 0;
            boolean[] vis = new boolean[status.length];
            for(int v:initialBoxes){
                dfs(v,status,keys,containedBoxes,vis);
            }
            for(int i = 0; i < candies.length;i++){
                if(vis[i] && status[i] == 1){
                    count = count+candies[i];
                }
            }
            return count;
        }
        public void dfs(int v,int[] status,int[][] keys,int[][] containedBox,boolean[] vis){
            vis[v] = true;
            for(int vkey:keys[v]){
                if(vkey == v) {
                    continue;
                }
                status[vkey] = 1;
            }
            for(int vcontain:containedBox[v]){
                if(!vis[vcontain]){
                    dfs(vcontain,status,keys,containedBox,vis);
                }
            }
        }

    public static void main(String[] args) {
        int[] status={1,0,1,0};
        int[] candies= {7,4,3,21};
        int[][] keys ={{},{},{1},{}};
        int[][] containedBoxes = {{1,2},{3},{},{}};
        int[] initialBoxes = {0};

        June_3 obj = new June_3();
        int resutl = obj.maxCandies(status,candies,keys,containedBoxes,initialBoxes);
        System.out.println(resutl);

    }
}
