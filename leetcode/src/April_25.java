import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class April_25 {

        public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {

            int count = 0;
            long final_count = 0;
            HashMap<Integer,Integer> hm = new HashMap<>();
            hm.put(0,1);


            for(Integer num:nums){
                if(num % modulo == k ) {
                    count++;
                }
                int mod = ((count - k ) % modulo + modulo)%modulo;
                final_count = final_count + hm.getOrDefault(mod,0);

                int currentMod = count % modulo;
                hm.put(currentMod, hm.getOrDefault(currentMod, 0) + 1);
            }
            return final_count;



        }

    public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(1);
            list.add(2);
            list.add(1);

            int modulo = 2;
            int k = 1;

            April_25 obj = new April_25();
            long result = obj.countInterestingSubarrays(list,modulo,k);
            System.out.println(result);






    }
}
