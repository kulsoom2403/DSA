import java.util.HashMap;

public class June_10 {

        public int maxDifference(String s) {
            HashMap<Character,Integer> hm= new HashMap<>();
            //count the frequncy
            for(char c:s.toCharArray()){
                hm.put(c,hm.getOrDefault(c,0)+1);
            }

            int maxodd  = 1;
            int mineven = s.length();
            //check freq is odd and even
            for(int value :hm.values()){
                if(value %2 == 1){
                    maxodd = Math.max(maxodd,value);
                }
                else {
                    mineven = Math.min(mineven,value);
                }
            }
            return maxodd-mineven;



        }

    public static void main(String[] args) {
        String s = "aaaaabbc";
        June_10 obj = new June_10();
        int result = obj.maxDifference(s);
        System.out.println(result);
    }
}
