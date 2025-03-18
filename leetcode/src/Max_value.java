public class Max_value {

        public int findMaxK(int[] nums) {

            int n = nums.length;
            int max = -1;
            for(int i = 0; i <  n;i++) {
                for(int j = 0; j < n;j++) {

                    if(nums[i] == -nums[j]) {
                        max = Math.max(max,nums[i]);
                    }
                }
            }
            return max;


        }

    public static void main(String[] args) {
        int[] nums ={-1,2,-3,3};
        Max_value obj = new Max_value();
        int result = obj.findMaxK(nums);
        System.out.println(result);
    }
}
