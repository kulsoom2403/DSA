import java.util.ArrayList;
import java.util.Arrays;

public class March_1 {

        public int[] applyOperations(int[] nums) {
            int len = nums.length;
            for(int i = 0;i < len - 1;i++) {
                if(nums[i] == nums[i+1] && nums[i] != 0) {
                    nums[i] = nums[i]*2;
                    nums[i+1] = 0;
                }
            }
            ArrayList<Integer> result = new ArrayList<>();
            for(int num:nums){
                if(num != 0) {
                    result.add(num);
                }
            }
            while(result.size() < len) {
                result.add(0);
            }
            for(int i = 0;i < len ;i++) {
                nums[i] = result.get(i);
            }
            return nums;

        }

    public static void main(String[] args) {
        int[] nums ={1,2,2,1,1,0};
        March_1 obj = new March_1();
        int[] result = obj.applyOperations(nums);
        System.out.println(Arrays.toString(result));

    }

}
