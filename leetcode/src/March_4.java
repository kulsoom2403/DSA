public class March_4 {

        public boolean checkPowersOfThree(int n) {
            while(n > 0) {
                int rem = n % 3;
                if(rem == 2) {
                    return false;
                }
                n=n/3;

            }
            return true;
        }

    public static void main(String[] args) {
        int n = 12;
        March_4 obj = new March_4();
        boolean result = obj.checkPowersOfThree(n);
        System.out.println(result);

    }
}
