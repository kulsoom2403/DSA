import java.util.Arrays;

public class Buy1 {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};

        int maxprofit = 0;
        int profit;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1;j <nums.length;j++ ) {
                 profit = nums[j] - nums[i];

                if(profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        System.out.println(maxprofit);



    }
}
