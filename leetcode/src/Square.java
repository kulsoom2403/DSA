import java.util.Arrays;
import java.util.Queue;

public class Square {

        public int[] sortedSquares(int[] nums) {

            int[] n = new int[nums.length];

            for(int i = 0; i < nums.length;i++) {
                n[i] = nums[i] * nums[i];

            }
            Arrays.sort(n);
            return n;
        }

    public static void main(String[] args) {
        int[] nums = {-1,-4,0,3,4};
        Square obj = new Square();
        int[] result = obj.sortedSquares(nums);
        System.out.println(Arrays.toString(result));

    }

}
