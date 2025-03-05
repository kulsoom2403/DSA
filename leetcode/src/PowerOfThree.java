public class PowerOfThree {

        public boolean isPowerOfThree(int n) {

            if(n <=0 ) {
                return false;
            }
            while(n%3 == 0) {
                n = n/3;

            }
            return n == 1;




        }

    public static void main(String[] args) {
        int n = 27;
        PowerOfThree obj = new PowerOfThree();
        boolean result = obj.isPowerOfThree(n);
        System.out.println(result);

    }
}
