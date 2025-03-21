public class DiifferenceNum {

        public int differenceOfSum(int[] nums) {
            int sum = 0;
            int totalSum =0;
            int result =0;


            for(int i =0; i < nums.length;i++) {
                sum = sum + nums[i];

            }
            for(int num:nums) {
                while(num > 0) {
                    totalSum = totalSum + num%10;
                    num = num/10;

                    result = sum -totalSum;
                }
            }
            return result;

        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,10};
        DiifferenceNum obj = new DiifferenceNum();
        int res = obj.differenceOfSum(nums);
        System.out.println(res);
    }
}
