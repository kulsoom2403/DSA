import java.util.Arrays;

public class June_13 {

        public int minimizeMax(int[] nums, int p) {
            if (p == 0) return 0;
            Arrays.sort(nums);
            int n = nums.length, left = 0, right = nums[n-1] - nums[0];
            while (left < right) {
                int mid = left + (right - left) / 2, pairs = 0;
                for (int i = 1; i < n; i++) {
                    if (nums[i] - nums[i-1] <= mid) {
                        pairs++;
                        i++;
                    }
                }
                if (pairs >= p) right = mid;
                else left = mid + 1;
            }
            return left;
        }

    public static void main(String[] args) {
            int[] nums ={2,5,1,4,1,7,10};
            int p =2;
            June_13 obj = new June_13();
            int result = obj.minimizeMax(nums,p);
        System.out.println(result);

    }
}
