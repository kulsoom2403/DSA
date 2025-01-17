import java.util.ArrayList;
import java.util.List;

public class Summary_range {

        public List<String> summaryRanges(int[] nums) {
            List<String> list = new ArrayList<>();

            for(int i = 0; i < nums.length;i++){
                int start = nums[i];
                while(i+1 < nums.length && nums[i+1] - nums[i] == 1) {
                    i++;
                }
                if(start!=nums[i]){
                    list.add(""+start+"->"+nums[i]);
                }
                else {
                    list.add(""+start);
                }
            }
            return list;
        }



}
