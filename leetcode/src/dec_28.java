public class dec_28 {

        public int countNegatives(int[][] grid) {
            int n = grid.length;
            int row = grid[0].length;
            int count = 0;
            for(int i = 0; i <n;i++){
                for(int j = 0;j < row;j++){
                    if(grid[i][j] < 0){
                        count++;

                    }
                }
            }
            return count;

        }

    public static void main(String[] args) {
        int[][] grid = {{2,3,1},{1,2,-2},{-1,-2,-3}};
        dec_28 obj = new dec_28();
        int result = obj.countNegatives(grid);
        System.out.println(result);
    }
}
