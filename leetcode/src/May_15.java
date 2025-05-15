import java.util.ArrayList;
import java.util.List;

public class May_15 {

        public List<String> getLongestSubsequence(String[] words, int[] groups) {
            int n = groups.length;
            List<String> result = new ArrayList<>();
            result.add(words[0]);

            for(int i = 1; i < n;i++){
                if(groups[i-1] != groups[i]){
                    result.add(words[i]);
                }
            }
            return result;
        }

    public static void main(String[] args) {
        String[] words ={"a","b","c"};
        int[] groups = {0,1,1};

        May_15 obj = new May_15();
        List<String> res = obj.getLongestSubsequence(words,groups);
        System.out.println(res);
    }

}
