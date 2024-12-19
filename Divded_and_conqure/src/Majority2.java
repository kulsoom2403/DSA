import java.util.HashMap;

public class Majority2 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,2,2};

        HashMap<Integer,Integer> h = new HashMap<>();

        int majoritylength = nums.length/2;

        for(int num : nums) {
            h.put(num,h.getOrDefault(num,0) + 1);

            if(h.get(num) > majoritylength) {
                System.out.println(num);
            }
        }

    }
}
