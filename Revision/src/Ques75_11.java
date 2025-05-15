import java.util.Arrays;

public class Ques75_11 {

        public int maxOperations(int[] nums, int k) {
            Arrays.sort(nums);
            int n = nums.length;
            int i = 0;
            int j = nums.length - 1;
            int count = 0;
            while(i < j) {
                int sum = nums[i] + nums[j];
                if(sum == k){
                    count++;
                    i++;
                    j--;
                }
                else if(sum < k) {
                    i++;
                }
                else {
                    j--;
                }

            }

            return count;

        }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 5;
        Ques75_11 obj = new Ques75_11();
        int result = obj.maxOperations(nums,k);
        System.out.println(result);
    }
}
