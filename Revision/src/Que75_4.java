import java.util.ArrayList;
import java.util.List;

public class Que75_4 {

        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

            List<Boolean> result = new ArrayList<>();

            int max = 0;

            for(int candy : candies) {
                if(candy > max) {
                    max = candy;
                }
            }

            for(int candy : candies) {
                result.add(candy + extraCandies >= max);
            }
            return result;
        }

    public static void main(String[] args) {
        int[] nums = {5,6,4,3};
        int n = 3;
        Que75_4 obj = new Que75_4();
        List<Boolean> result = obj.kidsWithCandies(nums,n);
        System.out.println(result.toString());

    }
}
