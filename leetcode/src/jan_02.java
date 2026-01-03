public class jan_02 {

        public int repeatedNTimes(int[] nums) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == nums[i + 1] || nums[i] == nums[i + 2]) {
                    return nums[i];
                }
            }
            return nums[nums.length - 1];
        }

    public static void main(String[] args) {
        int[] nums = {3,2,1,1,3,1};
        jan_02 obj = new jan_02();
        int result = obj.repeatedNTimes(nums);
        System.out.println(result);
    }

}
