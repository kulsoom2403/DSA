import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class June_18 {

    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        if (n % 3 != 0) {
            return new int[0][0];
        }

        List<List<Integer>> group = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 3) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];

            int max = Math.max(a, Math.max(b, c));
            int min = Math.min(a, Math.min(b, c));
            int diff = max - min;

            if (diff > k) {
                return new int[0][0];
            }

            group.add(Arrays.asList(a, b, c));
        }

        int[][] finalResult = new int[group.size()][3];
        for (int i = 0; i < group.size(); i++) {
            List<Integer> groups = group.get(i);
            finalResult[i][0] = groups.get(0);
            finalResult[i][1] = groups.get(1);
            finalResult[i][2] = groups.get(2);
        }

        return finalResult;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 3, 9, 5,9,5,4};
        int k = 2;
        June_18 obj = new June_18();
        int[][] result = obj.divideArray(nums, k);

        for (int[] group : result) {
            System.out.println(Arrays.toString(group));
        }
    }
}
