import java.util.*;

class ElementDuplicate {


        public boolean containsDuplicate(int[] nums) {

            Map<Integer,Integer> m = new HashMap<>();
            for(int i = 0;i <nums.length;i++){
                if(m.containsKey(nums[i])){
                    return true;
                }
                else{
                    m.put(nums[i],1);
                }
            }
            return false;
        }

    public static void main(String[] args) {
        int[] nums = {2,3,1,3};

        ElementDuplicate cd = new ElementDuplicate();

        boolean contain = cd.containsDuplicate(nums);
        System.out.println(contain);


    }
}

