import com.sun.jdi.PathSearchingVirtualMachine;

public class Qeu75_12 {

        public double findMaxAverage(int[] nums, int k) {
            int sum = 0;
            for(int i = 0; i < k; i++) {
                sum = sum + nums[i];
            }
            int max = sum;
            int i = 0;
            int j = k;

            while(j < nums.length){
                sum = sum - nums[i];
                i++;
                sum = sum + nums[j];
                j++;

                max= Math.max(max,sum);
            }
            return (double) max/k;

        }

    public static void main(String[] args) {
        int[] nums ={1,12,-5,-6,50,3};
        int k = 4;
        Qeu75_12 obj = new Qeu75_12();
        Double res = obj.findMaxAverage(nums,k);
        System.out.println(res);
    }
}
