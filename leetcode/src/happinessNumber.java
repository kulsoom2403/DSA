import java.util.Arrays;

public class happinessNumber {

        public long maximumHappinessSum(int[] happiness, int k) {
            int n = happiness.length;
            Arrays.sort(happiness);
            long sum =  0;

            for(int i = 0;i < k;i++){
                int value = happiness[n-1-i] - i;

                if(value > 0){
                    sum += value;
                }




            }
            return sum;


        }

    public static void main(String[] args) {
        int[] arr = {3,5,2,5};
        int k = 2;
        happinessNumber obj = new happinessNumber();
        long result = obj.maximumHappinessSum(arr,k);
        System.out.println(result);
    }

}
