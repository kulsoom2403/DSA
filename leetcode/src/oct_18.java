import java.util.Arrays;

public class oct_18 {

        public int maxDistinctElements(int[] nums, int k) {
            int n = nums.length;
            Arrays.sort(nums);
            int count = 0;
            int pre = Integer.MIN_VALUE;

            for(int i = 0; i < n; i++){
                int minval = nums[i] - k;

                if(pre < minval){
                    pre = minval;
                    count++;
                }
                else if(pre < nums[i] + k){
                    pre = pre + 1;
                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        int[] nums = {1,3,2,4,2,3};
        int k = 2;

        oct_18 obj = new oct_18();
        int result = obj.maxDistinctElements(nums,k);
        System.out.println(result);
    }


}
