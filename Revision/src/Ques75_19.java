import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Ques75_19 {

        public boolean closeStrings(String word1, String word2) {
            if(word1.length() != word2.length()){
                return false;
            }
            HashMap<Character,Integer> hm1 = new HashMap<>();
            HashMap<Character,Integer> hm2 = new HashMap<>();

            for(char c:word1.toCharArray()){
                hm1.put(c,hm1.getOrDefault(c,0)+1);

            }

            for(char c:word2.toCharArray()){
                hm2.put(c,hm2.getOrDefault(c,0)+1);

            }
            Set<Character> set1 = hm1.keySet();
            Set<Character> set2 = hm2.keySet();

            if(!set1.equals(set2)){
                return false;
            }

            List<Integer> list1 = new ArrayList<>(hm1.values());
            List<Integer> list2 = new ArrayList<>(hm2.values());

            Collections.sort(list1);
            Collections.sort(list2);

            return list1.equals(list2);



        }

    public static void main(String[] args) {
        String word1="abbccc";
        String word2 ="bbaccc";

        Ques75_19 obj = new Ques75_19();
        Boolean result = obj.closeStrings(word1,word2);
        System.out.println(result);
    }
}
