public class May_20 {

        public boolean isZeroArray(int[] nums, int[][] queries) {
            int n = nums.length;
            int[] diff = new int[n+1];

            for(int[] query:queries){
                diff[query[0]]++;
                if(query[1] + 1 < diff.length){
                    diff[query[1] + 1]--;
                }
            }
            int sum = 0;
            for(int i = 0; i < n; i++) {
                sum = sum + diff[i];
                if(nums[i] <= sum) {
                    nums[i] = 0;
                }
                else {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        int[] nums ={4,3,2,1};
        int[][] queries ={{1,3},{0,2}};
        May_20 obj = new May_20();
        Boolean result = obj.isZeroArray(nums,queries);
        System.out.println(result);
    }
}
