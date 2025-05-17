public class Que75_14 {

        public int longestOnes(int[] nums, int k) {
            int n = nums.length;
            int j = 0;
            int count = 0;
            int max = 0;
            for(int i = 0; i < n;i++) {
                if(nums[i] == 0){
                    count++;
                }
                while(count > k) {
                    if(nums[j] == 0) {
                        count--;
                    }
                    j++;
                }
                max = Math.max(max,i-j+1);
            }
            return max;
        }

    public static void main(String[] args) {
        int[] nums ={0,0,0,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1};
        int k = 3;
        Que75_14 obj = new Que75_14();
        int result = obj.longestOnes(nums,k);
        System.out.println(result);
    }
}
