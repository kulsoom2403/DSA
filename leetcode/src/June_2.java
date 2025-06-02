import java.util.Arrays;

public class June_2 {

        public int candy(int[] ratings) {
            int n = ratings.length;
            int sum = 0;



            int[] candies = new int[n];
            Arrays.fill(candies,1);

            for(int i = 1; i < n;i++){
                if(ratings[i] > ratings[i-1]){
                    candies[i] = candies[i-1]+1;
                }
            }
            for(int i = n-2; i >= 0;i--){
                if(ratings[i] > ratings[i+1]){
                    candies[i] = Math.max(candies[i], candies[i + 1] + 1);
                }
            }

            for(int i = 0; i < candies.length;i++){
                sum = candies[i] + sum;

            }

            return sum;





        }

    public static void main(String[] args) {
        int[] ratings = {1,2,2};
        June_2 obj = new June_2();
        int result = obj.candy(ratings);
        System.out.println(result);
    }

}
