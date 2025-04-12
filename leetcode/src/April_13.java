import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class April_13 {

        public long countGoodIntegers(int n, int k) {
            Set<String> dict = new HashSet<>();
            int base = (int) Math.pow(10, (n - 1) / 2), skip = n & 1;
            for (int i = base; i < base * 10; i++) {
                String s = Integer.toString(i);
                s += new StringBuilder(s).reverse().substring(skip);
                long pal = Long.parseLong(s);
                if (pal % k == 0) {
                    char[] chars = s.toCharArray();
                    Arrays.sort(chars);
                    dict.add(new String(chars));
                }
            }

            long[] fact = new long[n + 1];
            fact[0] = 1;
            for (int i = 1; i <= n; i++) fact[i] = fact[i - 1] * i;

            long ans = 0;
            for (String s : dict) {
                int[] cnt = new int[10];
                for (char c : s.toCharArray()) cnt[c - '0']++;
                long tot = (n - cnt[0]) * fact[n - 1];
                for (int x : cnt) tot /= fact[x];
                ans += tot;
            }
            return ans;
        }

    public static void main(String[] args) {
        April_13 sol = new April_13();

        // Example test case
        int n = 4;  // Number of digits
        int k = 3;  // Divisor

        long result = sol.countGoodIntegers(n,k);
        System.out.println("Count of good integers: " + result);
    }


}
