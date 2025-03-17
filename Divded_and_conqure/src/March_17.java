import java.util.HashMap;

public class March_17 {

        public boolean divideArray(int[] nums) {
            HashMap<Integer,Integer> hm = new HashMap<>();

            for(int num :nums){
                hm.put(num,hm.getOrDefault(num,0) + 1);

            }
            for(int count:hm.values()){
                if(count %2 != 0){
                    return false;
                }

            }
            return true;

        }

    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
        March_17 obj = new March_17();
        boolean result = obj.divideArray(nums);
        System.out.println(result);

    }

}
