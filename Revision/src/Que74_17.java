public class Que74_17 {

        public int pivotIndex(int[] nums) {
            int n = nums.length;
            int total = 0;
            for(int num:nums){
                total = total+num;
            }
            int leftSum =0;
            for(int i = 0; i < n;i++){
                if(leftSum == total - leftSum - nums[i]){
                    return i;
                }
                leftSum = leftSum + nums[i];
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] nums ={1,7,3,6,5,6};
        Que74_17 obj = new Que74_17();
        int result = obj.pivotIndex(nums);
        System.out.println(result);
    }

}
