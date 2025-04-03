public class April_3 {

        public long maximumTripletValue(int[] nums) {
            int n = nums.length;
            if (n < 3) {
                return 0;
            }

            long res = 0;
            int max_prefix = nums[0];

            int[] max_suffix = new int[n];
            max_suffix[n - 1] = nums[n - 1];

            // Compute the maximum suffix values
            for (int k = n - 2; k >= 0; k--) {
                max_suffix[k] = Math.max(max_suffix[k + 1], nums[k]);
            }

            // Iterate over possible middle values
            for (int j = 1; j < n - 1; j++) {  // Ensure j+1 is within bounds
                max_prefix = Math.max(max_prefix, nums[j - 1]);
                res = Math.max(res, (long) (max_prefix - nums[j]) * max_suffix[j + 1]);
            }

            return res;
        }

    public static void main(String[] args) {
        int[] nums ={12,6,1,2,7};
        April_3 obj = new April_3();
        long res = obj.maximumTripletValue(nums);
        System.out.println(res);

    }

}
