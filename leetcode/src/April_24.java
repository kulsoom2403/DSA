import java.util.HashSet;
import java.util.Set;

public class April_24 {

        public int countCompleteSubarrays(int[] nums) {


            Set<Integer> set = new HashSet<>();

            for(int num:nums) {
                set.add(num);



            }
            int totaldistinct = set.size();//3

            int count = 0;
            for(int i = 0; i < nums.length;i++) {
                Set<Integer> seen = new HashSet<>();
                for(int j = i; j < nums.length; j++) {
                    seen.add(nums[j]);
                    if(seen.size() == totaldistinct){
                        count++;
                    }

                }
            }
            return count;

        }

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,2,3};
        April_24 obj = new April_24();
        int result = obj.countCompleteSubarrays(nums);
        System.out.println(result);
    }

}
