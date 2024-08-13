import java.util.HashMap;

public class Two_sum {
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                int res = target - nums[i];
                if (hm.containsKey(res)) {
                    int[] arr = {hm.get(res), i};
                    return arr;
                }
                hm.put(nums[i], i);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}
