import java.util.HashMap;

public class RomanToInt {

        public int romanToInt(String s) {
            HashMap<Character,Integer> hm = new HashMap<>();
            hm.put('I',1);
            hm.put('V',5);
            hm.put('X',10);
            hm.put('L',50);
            hm.put('C',100);
            hm.put('D',500);
            hm.put('M',1000);

            int n = s.length();
            int result = 0;
            for(int i = 0; i < n; i++) {
                char ch1 = s.charAt(i);

                if((i + 1) < n && hm.get(ch1) < hm.get(s.charAt(i+1))){
                    result = result - hm.get(ch1);
                }
                else {
                    result = result + hm.get(ch1);
                }

            }
            return result;



        }

    public static void main(String[] args) {
        String s = "XVIL";
        RomanToInt obj = new RomanToInt();
        int res = obj.romanToInt(s);
        System.out.println(res);
    }

}
