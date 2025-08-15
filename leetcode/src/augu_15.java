public class augu_15 {
        public boolean isPowerOfFour(int n) {
            if(n <= 0) return false;
            while( n%4 == 0) {
                n /= 4;
            }
            return n == 1;
        }

    public static void main(String[] args) {
        int n = 9;
        augu_15 obj = new augu_15();
        boolean result = obj.isPowerOfFour(n);
        System.out.println(result);
    }
}
