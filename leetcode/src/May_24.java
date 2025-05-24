import java.util.ArrayList;
import java.util.List;

public class May_24 {

        public List<Integer> findWordsContaining(String[] words, char x) {
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < words.length;i++) {
                if(words[i].indexOf(x) != -1) {
                    list.add(i);
                }
            }
            return list;

        }

    public static void main(String[] args) {
        String[] words ={"leet","code"};
        char x ='e';
        May_24 obj = new May_24();
        List<Integer> result = obj.findWordsContaining(words,x);
        System.out.println(result);

    }

}
