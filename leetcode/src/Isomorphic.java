import java.util.HashMap;
public class Isomorphic {



        public boolean isIsomorphic(String s, String t) {
            if(s.length() != t.length()) {
                return false;
            }

            HashMap<Character, Character> hm = new HashMap<>();
            HashMap<Character, Boolean> hm2 = new HashMap<>();
            int n = s.length();

            for (int i = 0; i < n; i++) {
                char ch1 = s.charAt(i);
                char ch2 = t.charAt(i);


                if (hm.containsKey(ch1)) {
                    if (hm.get(ch1) != ch2) {
                        return false;
                    }
                } else {

                    if (hm2.containsKey(ch2)) {
                        return false;
                    }


                    hm.put(ch1, ch2);
                    hm2.put(ch2, true);
                }
            }

            return true;
        }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        Isomorphic obj = new Isomorphic();
        Boolean res = obj.isIsomorphic(s,t);
        System.out.println(res);
    }


}
