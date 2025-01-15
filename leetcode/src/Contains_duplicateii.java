import java.util.HashMap;

public class Contains_duplicateii {

        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
            for(int i = 0; i < nums.length; i++) {
                if(!hm.containsKey(nums[i])) {
                    hm.put(nums[i],i);
                }
                else {
                    int pre = hm.get(nums[i]);
                    if(Math.abs(pre - i) <= k) {
                        return true;
                    }
                    else {
                        hm.put(nums[i],i);
                    }
                }
            }
            return false;

        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,5,1};
        int k = 3;
        Contains_duplicateii contains = new Contains_duplicateii();
        Boolean res = contains.containsNearbyDuplicate(nums,k);
        System.out.println(res);
    }

}
