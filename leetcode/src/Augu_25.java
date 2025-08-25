import java.util.*;

public class Augu_25 {



        public int[] findDiagonalOrder(int[][] mat) {

            int m = mat.length;
            int n = mat[0].length;

            HashMap<Integer, List<Integer>> mp = new HashMap<>();
            List<Integer> result = new ArrayList<>();

            // fill the map using (i+j)
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!mp.containsKey(i + j)) {
                        mp.put(i + j, new ArrayList<>());
                    }
                    mp.get(i + j).add(mat[i][j]);
                }
            }

            boolean flip = true;
            for (int key = 0; key <= m + n - 2; key++) {
                List<Integer> list = mp.get(key);

                if (flip) {
                    Collections.reverse(list);
                }

                result.addAll(list);
                flip = !flip;
            }

            // Convert List<Integer> to int[]
            int[] ans = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                ans[i] = result.get(i);
            }

            return ans;
        }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        Augu_25 obj = new Augu_25();
        int[] result = obj.findDiagonalOrder(mat);
        System.out.println(Arrays.toString(result));
    }
}
