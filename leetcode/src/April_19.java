import java.util.Arrays;

public class April_19 {

        public long countFairPairs(int[] nums, int lower, int upper) {
            Arrays.sort(nums);

            int n = nums.length;

            long  count = 0;
            for(int i = 0;i < n; i++) {
                int left = lowerBound(nums,i+1,n,lower-nums[i]);
                int right = upperBound(nums,i+1,n,upper-nums[i]);

                count = count+(right-left);
            }
            return count;

        }

        private int lowerBound(int[] nums,int start,int end,int target ) {
            while(start < end) {
                int mid = start + (end - start)/2;
                if(nums[mid] < target)  {
                    start = mid + 1;

                }
                else {
                    end = mid;
                }
            }
            return start;
        }

        private int upperBound(int[] nums,int start,int end,int target ) {
            while(start < end) {
                int mid = start + (end - start)/2;
                if(nums[mid] <= target)  {
                    start = mid + 1;

                }
                else {
                    end = mid;
                }
            }
            return start;
        }

    public static void main(String[] args) {
        int[] nums = {0,1,7,4,4,5,11};
        int lower = 3;
        int upper = 6;

        April_19 obj = new April_19();
        long result = obj.countFairPairs(nums,lower,upper);
        System.out.println(result);
    }

}
