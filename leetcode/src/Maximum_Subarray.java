public class Maximum_Subarray {

        public int maxSubArray(int[] nums) {
            int sum = 0;
            int max = nums[0];

            for(int i = 0;i <nums.length;i++){
                sum = sum + nums[i];
                if(sum > max){
                    max = sum;
                }
                if(sum < 0){
                    sum = 0;
                }
            }
            return max;

        }

    public static void main(String[] args) {
        int[] nums = {2,1,-1,4,1,6,-2,-4,-6};

        Maximum_Subarray ms = new Maximum_Subarray();
        int sum_of_subarray = ms.maxSubArray(nums);

        System.out.println(sum_of_subarray);
    }

}

