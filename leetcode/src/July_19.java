import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class July_19 {

        public List<String> removeSubfolders(String[] folder) {

            Arrays.sort(folder);
            List<String> result = new ArrayList<>();

            String pre ="";
            for(String curr : folder) {
                if(pre.isEmpty() || !curr.startsWith(pre + "/")) {
                    result.add(curr);
                    pre = curr;

                }
            }
            return result;




        }

    public static void main(String[] args) {
        String[] folder = {"/a","/a/b","/c/d","/a/b/c","/c/d"};
        July_19 obj = new July_19();
        List<String> result = obj.removeSubfolders(folder);
        System.out.println(result);
    }

}
