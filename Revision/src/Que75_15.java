public class Que75_15 {

        public int longestSubarray(int[] nums) {
            int n = nums.length;
            int k = 1;
            int left = 0;
            int count = 0;
            int max = 0;

            for(int i = 0; i < n;i++){
                if(nums[i] == 0){
                    count++;
                }
                while(count > 1){
                    if(nums[left] == 0) {
                        count--;
                    }
                    left++;
                }
                max = Math.max(max,i-left );
            }
            return max;

        }

    public static void main(String[] args) {
        int[] nums ={1,1,0,1};
        Que75_15 obj = new Que75_15();
        int result = obj.longestSubarray(nums);
        System.out.println(result);
    }
}
