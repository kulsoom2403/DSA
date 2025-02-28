import java.util.Arrays;

public class three_sum_cloesest {



        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with the first triplet

            for (int i = 0; i < nums.length - 2; i++) {
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                        closestSum = sum;
                    }

                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        return target; // If the exact target is found
                    }
                }
            }
            return closestSum;
        }

    public static void main(String[] args) {
        int[] nums = {1,2,-1,2};
        int target = 1;
        three_sum_cloesest obj = new three_sum_cloesest();
        int result = obj.threeSumClosest(nums,target);
        System.out.println(result);
    }





}
