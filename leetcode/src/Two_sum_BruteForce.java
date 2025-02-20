import java.util.Arrays;

public class Two_sum_BruteForce {

        public int[] twoSum(int[] nums, int target) {
            for(int i = 0;i < nums.length;i++) {
                for(int j = i + 1; j < nums.length;j++)
                    if(nums[i] +nums[j] == target) {
                        return new int[]{i,j};
                    }
            }
            return new int[]{};



        }

    public static void main(String[] args) {
        int[] nums={3,2,1,4};
        int target = 5;
        Two_sum_BruteForce two = new Two_sum_BruteForce();
        int[] result = two.twoSum(nums,target);
        System.out.println(Arrays.toString(result));

    }

}
