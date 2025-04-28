public class April_28 {

        public long countSubarrays(int[] nums, long k) {
            int n = nums.length;
            long count = 0;
            long sum = 0;

            int left = 0;

            for(int right = 0; right < n;right++) {
                sum = sum +nums[right];//update the sum

                while(sum * (right - left + 1) >= k){
                    sum = sum - nums[left];//if k is less than sum subrtract
                    left++;
                }
                count = count +(right -left +1);//update the count
            }



            return count;
        }

    public static void main(String[] args) {
        int[] nums = {2,1,4,3,5};
        int k = 10;
        April_28 obj = new April_28();
        long res = obj.countSubarrays(nums,k);
        System.out.println(res);
    }

}
