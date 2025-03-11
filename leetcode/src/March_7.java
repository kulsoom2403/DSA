import java.util.ArrayList;
import java.util.List;

public class March_7 {

        public int[] closestPrimes(int left, int right) {
            List<Integer> list = new ArrayList<>();

            for(int i = left; i <= right;i++) {
                if(isPrime(i)) {
                    list.add(i);
                }
            }
            if(list.size() < 2) {
                return new int[]{-1,-1};
            }
            int minDiff = Integer.MAX_VALUE;
            int[] result = new int[2];

            for(int i = 1; i < list.size();i++) {
                int diff = list.get(i) - list.get(i-1);
                if(diff < minDiff) {
                    minDiff = diff;
                    result[0] =list.get(i-1);
                    result[1] =list.get(i);
                }
            }
            return result;

        }




        private boolean isPrime(int n) {
            if(n <= 1) {
                return false;
            }
            for(int i = 2; i <= Math.sqrt(n);i++) {
                if(n%i == 0) {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        int left = 10;
        int right = 19;

        March_7 obj = new March_7();
        boolean isleft = obj.isPrime(left);

        int[] result = obj.closestPrimes(left,right);
        System.out.println(+result[0]+" "+result[1]);
    }




}
