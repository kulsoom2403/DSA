public class Que75_46 {

        public int findCircleNum(int[][] isConnected) {
            int n = isConnected.length;
            boolean[] visited = new boolean[n];
            int count = 0;

            for(int i =0; i < n;i++){
                if(!visited[i]){
                    dfs(isConnected,visited,i);
                    count++;
                }
            }
            return count;
        }
        private void dfs(int[][] isConnected,boolean[] visited,int i){
            visited[i] = true;
            for(int j = 0; j < isConnected.length;j++){
                if(isConnected[i][j] == 1 && !visited[j]){
                    dfs(isConnected,visited,j);
                }
            }
        }

    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,1},{1,0,0}};
        Que75_46 obj = new Que75_46();
        int result = obj.findCircleNum(isConnected);
        System.out.println(result);
    }

}
