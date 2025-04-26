public class April_26 {

        public long countSubarrays(int[] nums, int minK, int maxK) {//[1,3,5,2,7,5],1,5

            long ans = 0;
            int badIndex = -1;
            int lastMinIndex = -1;//1
            int lastMaxIndex = -1;

            for(int i  = 0; i < nums.length;i++) {
                if(nums[i] < minK || nums[i] > maxK ) {
                    badIndex  = i;


                }
                if(nums[i] == minK) {
                    lastMinIndex = i;
                }
                if(nums[i] == maxK){
                    lastMaxIndex = i;
                }

                int min = Math.min(lastMinIndex,lastMaxIndex);
                if (min > badIndex) {
                    ans =  ans + min - badIndex;
                }
            }
            return ans;

        }

    public static void main(String[] args) {
        int[] nums ={1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;

        April_26 obj = new April_26();
        long result = obj.countSubarrays(nums,minK,maxK);
        System.out.println(result);
    }
}
