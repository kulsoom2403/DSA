import java.util.HashMap;

public class first_char {

        public int firstUniqChar(String s) {
            HashMap<Character,Integer> hm = new HashMap<>();

            for(char c:s.toCharArray()) {
                hm.put(c,hm.getOrDefault(c,0) + 1);
            }

            for(int i = 0; i < s.length();i++) {
                if(hm.get(s.charAt(i))==1){
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        String s = "ummekulsoom";
        first_char obj = new first_char();
        int result = obj.firstUniqChar(s);
        System.out.println(result);
    }

}
