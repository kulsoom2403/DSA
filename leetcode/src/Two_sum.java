import java.util.HashMap;

public class Two_sum {
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        int[] a={i,j};
                        return a;
                    }
                }
            }
            return null;

        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 13;

        int[] result = sol.twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}
