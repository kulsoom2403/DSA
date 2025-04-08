import java.util.HashSet;

public class April_8 {

        public int minimumOperations(int[] nums) {
            int ans = 0;
            for (int i = 0; i < nums.length; i += 3, ans++) {
                if (checkUnique(nums, i)) {
                    return ans;
                }
            }
            return ans;
        }

        private boolean checkUnique(int[] nums, int start) {
            HashSet<Integer> cnt = new HashSet<>();
            for (int i = start; i < nums.length; i++) {
                if (cnt.contains(nums[i])) {
                    return false;
                }
                cnt.add(nums[i]);
            }
            return true;
        }

    public static void main(String[] args) {
        int[] nums= {1,2,3,4,2,3,3,5,7};
        April_8 obj = new April_8();
        int result = obj.minimumOperations(nums);
        System.out.println(result);
    }

}
