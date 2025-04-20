import java.util.HashMap;

public class April_20 {

        public int numRabbits(int[] answers) {

            HashMap<Integer,Integer> hm = new HashMap<>();

            int total = 0;

            for(int ans:answers) {
                hm.put(ans,hm.getOrDefault(ans,0) + 1);
            }

            for(HashMap.Entry<Integer,Integer> entry : hm.entrySet()) {
                int answer = entry.getKey();
                int freq  = entry.getValue();
                int size = answer + 1;
                int group = (int)Math.ceil((double)freq/size);
                total = total+group*size;
            }
            return total;

        }

    public static void main(String[] args) {
        int[] nums= {10,10,10};
        April_20 obj = new April_20();
        int result = obj.numRabbits(nums);
        System.out.println(result);
    }

}
