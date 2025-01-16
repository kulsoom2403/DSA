import java.util.List;

public class Summary {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,7,8};
        Summary_range summary = new Summary_range();
        List<String> res = summary.summaryRanges(nums);
        System.out.println(res);

    }
}
