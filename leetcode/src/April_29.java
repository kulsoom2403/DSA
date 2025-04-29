public class April_29 {

        public long countSubarrays(int[] nums, int k) {//[1,3,2,3,3]
            int max = Integer.MIN_VALUE;

            for(int num:nums) {
                max = Math.max(num,max);
            }

            int n = nums.length;
            int left = 0;
            long ans = 0;
            int count = 0;

            for(int right = 0; right < n;right++){
                if(nums[right] == max){
                    count++;
                }
                while(count >= k) {
                    ans = ans + n - right;

                    if(nums[left] == max){
                        count--;
                    }
                    left++;
                }
            }
            return ans;



        }

    public static void main(String[] args) {
        int[] nums = {1,3,2,3,3};
        int k = 2;
        April_29 obj = new April_29();
        long res = obj.countSubarrays(nums,k);
        System.out.println(res);
    }
}
