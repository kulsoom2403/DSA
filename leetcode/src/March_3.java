import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class March_3 {

        public int[] pivotArray(int[] nums, int pivot) {
            List<Integer> left = new ArrayList<>();
            List<Integer> mid = new ArrayList<>();
            List<Integer> right = new ArrayList<>();

            for(int num:nums) {
                if(num < pivot) {
                    left.add(num);
                }
                else if(num == pivot) {
                    mid.add(num);

                }
                else {
                    right.add(num);

                }
            }
            List<Integer> result = new ArrayList<>();
            result.addAll(left);
            result.addAll(mid);
            result.addAll(right);

            int[] ans = new int[nums.length];
            for(int i =0;i < nums.length;i++) {
                ans[i] = result.get(i);
            }
            return ans;
        }

    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        March_3 obj = new March_3();
        int[] result = obj.pivotArray(nums,pivot);
        System.out.println(Arrays.toString(result));

    }
}
