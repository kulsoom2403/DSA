public class Que75_7 {

        public boolean increasingTriplet(int[] nums) {//[2,1,5,0,4,6]


            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;

            for(int num:nums) {
                if(num <= first) {
                    first = num;
                }
                else if(num <= second) {
                    second = num;
                }
                else{
                    return true;
                }
            }
            return false;

        }

    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5};
        Que75_7 obj = new Que75_7();
        Boolean res = obj.increasingTriplet(nums);
        System.out.println(res);
    }
}
