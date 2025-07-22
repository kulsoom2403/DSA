public class July_22 {

        public int maximumUniqueSubarray(int[] nums)
        {
            int n = nums.length;


            int[] prefixSum = new int[n + 1];
            for (int i = 0; i < n; ++i)
            {
                prefixSum[i + 1] = prefixSum[i] + nums[i];
            }


            int[] lastSeen = new int[10001];

            int left = 0, maxSum = 0;
            for (int right = 1; right <= n; ++right)
            {
                int val = nums[right - 1];

                left = Math.max(left, lastSeen[val]);


                maxSum = Math.max(maxSum, prefixSum[right] - prefixSum[left]);


                lastSeen[val] = right;
            }


            return maxSum;
        }

    public static void main(String[] args) {
        int[] nums = {4,2,4};
        July_22 obj = new July_22();
        int result = obj.maximumUniqueSubarray(nums);
        System.out.println(result);

    }
}
