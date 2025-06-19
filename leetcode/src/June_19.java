import java.util.Arrays;

public class June_19 {

        public int partitionArray(int[] nums, int k) {

            // int  n = nums.length;
            Arrays.sort(nums);
            int count = 1;
            int start = nums[0];


            for(int i = 1; i < nums.length;i++){
                if(nums[i] - start > k){
                    count++;
                    start = nums[i];
                }

            }
            return count;

        }

    public static void main(String[] args) {
        int[] nums = {2,1,5,3,4};
        int k =2;
        June_19 obj = new June_19();
        int result = obj.partitionArray(nums,k);
        System.out.println(result);
    }

}
