public class Que75_21 {

        public int singleNumber(int[] nums) {
            int n = nums.length;

            for(int i = 0; i< n;i++) {
                int count = 0;
                for(int j = 0;j<n;j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
                if(count == 1){
                    return nums[i];
                }
            }
            if(n == 1)
            {
                return nums[0];
            }
            return -1;

        }

    public static void main(String[] args) {
        int[] nums ={4,1,2,1,2};
        Que75_21 obj = new Que75_21();
        int result = obj.singleNumber(nums);
        System.out.println(result);
    }
}
