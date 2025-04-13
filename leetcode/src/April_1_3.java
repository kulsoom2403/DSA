public class April_1_3 {

        long m = (long)1e9 + 7;

        long power(long a, long b) {
            if (b == 0) {
                return 1;
            }
            long half = power(a, b / 2);
            long result = (half * half) % m;
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            return result;
        }

        public int countGoodNumbers(long n) {
            long odd = power(5, (n + 1) / 2);
            long even = power(4, n / 2);
            return (int)((odd * even) % m);
        }

    public static void main(String[] args) {
        long n = 4;
        April_1_3 obj = new April_1_3();
        int result = obj.countGoodNumbers(n);
        System.out.println(result);
    }

}
