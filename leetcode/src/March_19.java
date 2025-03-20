public class March_19 {

        public int minOperations(int[] nums) {
            int n = nums.length, k = 0;

            for (int i = 0; i <= n - 3; i++) {
                if (nums[i] == 0) {
                    nums[i] =nums[i]^ 1;
                    nums[i + 1] =nums[i+1]^1;
                    nums[i + 2] =nums[i+2] ^ 1;
                    k++;
                }
            }

            for (int num : nums) {
                if (num == 0) return -1;
            }
            return k;
        }

    public static void main(String[] args) {
        int[] nums = {0,1,1,0,0,1};
        March_19 obj = new March_19();
        int resut = obj.minOperations(nums);
        System.out.println(resut);
    }

}
