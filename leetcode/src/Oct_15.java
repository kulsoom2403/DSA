import java.util.*;

public class Oct_15 {

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int current = 1;
        int pre = 0;

        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                current++;
            } else {
                pre = current;
                current = 1;
            }

            if (current / 2 >= k) {
                return true;
            }

            if (Math.min(current, pre) >= k) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Oct_15 obj = new Oct_15();


        List<Integer> nums = Arrays.asList(1, 2, 3, 1, 2, 3);
        int k = 2;

        boolean result = obj.hasIncreasingSubarrays(nums, k);
        System.out.println("Has increasing subarrays of length " + k + ": " + result);
    }
}
