import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagram {




        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> ans = new HashMap<>();


            for(String str : strs) {

                char[] cha = str.toCharArray();
                Arrays.sort(cha);


                String key = String.valueOf(cha);


                if (!ans.containsKey(key)) {
                    ans.put(key, new ArrayList<>());
                }


                ans.get(key).add(str);
            }

            return new ArrayList<>(ans.values());
        }


    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        Group_Anagram anagram = new Group_Anagram();
        List<List<String>> res = anagram.groupAnagrams(str);
        System.out.println(res);
    }

}
