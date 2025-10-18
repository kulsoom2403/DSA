import java.util.HashMap;

public class oct_16 {

        public int findSmallestInteger(int[] nums, int value) {
            HashMap<Integer, Integer> hm = new HashMap<>();

            for (int num : nums) {
                int r = ((num % value) + value) % value;
                hm.put(r, hm.getOrDefault(r, 0) + 1);


            }

            int MEX = 0;
            while (hm.getOrDefault(MEX % value, 0) > 0) {
                hm.put(MEX % value, hm.get(MEX % value) - 1);
                MEX++;
            }
            return MEX;
        }

    public static void main(String[] args) {
        int[] nums = {1,-10,3,4,5};
        int value = 2;
        oct_16 obj = new oct_16();
        int result = obj.findSmallestInteger(nums,value);
        System.out.println(result);
    }


}
