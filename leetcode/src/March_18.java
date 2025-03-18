public class March_18 {

        public int longestNiceSubarray(int[] nums) {
            int left = 0;
            int bitmake = 0;
            int maxLen = 0;

            for(int right = 0; right < nums.length;right++) {
                while((bitmake & nums[right]) != 0) {
                    bitmake = bitmake^nums[left];
                    left++;
                }
                bitmake = bitmake | nums[right];
                maxLen = Math.max(maxLen,right - left +1);
            }
            return maxLen;


        }

    public static void main(String[] args) {
        int[] nums = {1,3,8,48,10};
        March_18 obj = new March_18();
        int result = obj.longestNiceSubarray(nums);
        System.out.println(result);
    }
}
