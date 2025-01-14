import java.util.HashSet;

public class Happy_Number {

        public boolean isHappy(int n) {

            HashSet<Integer> hs = new HashSet<>();


            while(n != 1) {
                int sum = 0;

                while(n > 0) {
                    int last_digits = n % 10;
                    sum = sum + last_digits * last_digits;
                    n = n/10;
                }
                if(hs.contains(sum)) {
                    return false;
                }
                hs.add(sum);
                n = sum;
            }

            return true;


        }

    public static void main(String[] args) {
        int n = 82;
        Happy_Number Happy = new Happy_Number();
        boolean res = Happy.isHappy(n);
        System.out.println(res);

    }

}
