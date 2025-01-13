import java.util.HashMap;

public class Word_pattern {

        public boolean wordPattern(String pattern, String s) {


            String [] arr = s.split(" ");

            if( pattern.length() != arr.length) {
                return false;
            }
            HashMap<Character,String> hm = new HashMap<Character,String>();

            for(int i = 0; i < pattern.length();i++) {
                char ch = pattern.charAt(i);
                boolean b = hm.containsKey(ch);

                if(hm.containsValue(arr[i]) && !b) {
                    return false;
                }
                if(b &&  !hm.get(ch).equals(arr[i])) {
                    return false;
                }
                else {
                    hm.put(ch,arr[i]);
                }

            }
            return true;


        }

    public static void main(String[] args)
    {
        String pattern = "aabb";
        String s = "dog cat cat dog";
        Word_pattern wordpatter = new Word_pattern();
        boolean res =  wordpatter.wordPattern(pattern,s);
        System.out.println(res);
    }


}
