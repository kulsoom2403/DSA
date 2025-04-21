public class April_21 {

        public int numberOfArrays(int[] differences, int lower, int upper) {
            long minprefix = 0;
            long maxprefix = 0;//1
            long count = 0;//1

            for(int diff : differences) {
                count = count + diff;
                minprefix = Math.min(minprefix,count);
                maxprefix = Math.max(maxprefix,count);

            }
            long min = lower - minprefix;
            long max = upper - maxprefix;

            if(min > max) {
                return 0;
            }
            return(int)(max-min + 1);
        }

    public static void main(String[] args) {
        int[] nums ={1,-3,4};
        int lower = 1;
        int upper = 6;
        April_21 obj = new April_21();
        int result = obj.numberOfArrays(nums,lower,upper);
        System.out.println(result);

    }
}
