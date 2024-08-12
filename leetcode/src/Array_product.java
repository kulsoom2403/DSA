public class Array_product {

    static class Solution {
        public int[] product(int[] nums) {
            int n = nums.length;
            int[] start = new int[n];
            int[] end = new int[n];
            int[] res = new int[n];

            start[0] = 1;
            for (int i = 1; i < n; i++) {
                start[i] = start[i - 1] * nums[i - 1];
            }

            end[n - 1] = 1;
            for (int i = n - 2; i >= 0; i--) {
                end[i] = end[i + 1] * nums[i + 1];
            }

            for (int i = 0; i < n; i++) {
                res[i] = start[i] * end[i];
            }

            return res;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = sol.product(nums);


        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
