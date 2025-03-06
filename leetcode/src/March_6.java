import java.util.Arrays;
import java.util.HashSet;

public class March_6 {

        public int[] findMissingAndRepeatedValues(int[][] grid) {
            int n = grid.length;
            int repeated = -1;
            int missing = -1;

            int totalSum = 0;

            HashSet<Integer> hm = new HashSet<>();
            long sum = 0;

            for(int i = 0;i < n;i++) {
                for(int j = 0;j <n;j++){
                    int num = grid[i][j];
                    totalSum = totalSum +num;

                    if(hm.contains(num)) {
                        repeated = num;
                    }
                    hm.add(num);
                }
            }
            long find = (long) n*n*(n*n+1)/2;
            missing = (int)(find - (totalSum-repeated));

            return new int[]{repeated,missing};

        }

    public static void main(String[] args) {
        int[][] grid = {{1,2},{2,3}};
        March_6 obj = new March_6();
        int[] result = obj.findMissingAndRepeatedValues(grid);
        System.out.println(Arrays.toString(result));
    }

}
