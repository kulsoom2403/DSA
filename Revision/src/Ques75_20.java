import java.util.HashMap;

public class Ques75_20 {

        public int equalPairs(int[][] grid) {
            int n = grid.length;
            HashMap<String,Integer> hm = new HashMap<>();

            for(int i = 0; i < n;i++){
                String rowkey = buildkey(grid[i]);
                hm.put(rowkey,hm.getOrDefault(rowkey,0)+1);
            }
            int count = 0;
            for(int j = 0; j < n;j++){
                int[] col = new int[n];
                for(int i = 0; i < n;i++){
                    col[i] = grid[i][j];
                }
                String colkey = buildkey(col);
                count = count + hm.getOrDefault(colkey,0);
            }
            return count;

        }


        private String buildkey(int[] arr){
            StringBuilder sb = new StringBuilder();
            for(int num:arr){
                sb.append(num).append("#");
            }
            return sb.toString();
        }

    public static void main(String[] args) {
        int[][] grid ={{1,2,3},{4,3,1},{1,4,1}};
        Ques75_20 obj = new Ques75_20();
        int res = obj.equalPairs(grid);
        System.out.println(res);
    }
}
