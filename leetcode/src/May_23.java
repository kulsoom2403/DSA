public class May_23 {

        public long maximumValueSum(int[] nums, int k, int[][] edges) {
            long total = 0;
            int positiveGainCount = 0;
            int minPositiveGain = Integer.MAX_VALUE;

            for (int num : nums) {
                int xorValue = num ^ k;
                int gain = xorValue - num;
                if (gain > 0) {
                    total += xorValue;
                    positiveGainCount++;
                    minPositiveGain = Math.min(minPositiveGain, gain);
                } else {
                    total += num;
                    minPositiveGain = Math.min(minPositiveGain, -gain); // For potential correction
                }
            }

            if (positiveGainCount % 2 == 1) {
                total -= minPositiveGain;
            }

            return total;
        }

    public static void main(String[] args) {
        int[] nums={1,2,1};
        int k = 2;
        int[][] edges ={{0,1},{0,2}};
        May_23 obj = new May_23();
        long result = obj.maximumValueSum(nums,k,edges);
        System.out.println(result);
    }

}
