public class augu_9 {
        public boolean isPowerOfTwo(int n) {
            if(n < 0){
                return false;
            }
            if(n == 0){
                return false;
            }
            while(n > 0) {
                if(n == 1){
                    break;
                }

                if(n%2 != 0){
                    return false;
                }

                n = n/2;
            }
            return true;
        }

    public static void main(String[] args) {
        int n = 9;
        augu_9 obj = new augu_9();
        boolean result = obj.isPowerOfTwo(n);
        System.out.println(result);

    }
}
