public class June_23
{

        // Function to convert number to base-k
        public String convertToBase(long num, int k) {
            if (num == 0) return "0";
            StringBuilder res = new StringBuilder();
            while (num > 0) {
                res.append(num % k);
                num /= k;
            }
            return res.reverse().toString();
        }

        // Function to check palindrome
        public boolean isPalindrome(String s) {
            int i = 0, j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) return false;
                i++;
                j--;
            }
            return true;
        }

        public long kMirror(int k, int n) {
            long sum = 0;
            int length = 1;

            while (n > 0) {
                int halfLength = (length + 1) / 2;
                long start = (long) Math.pow(10, halfLength - 1);
                long end = (long) Math.pow(10, halfLength) - 1;

                for (long i = start; i <= end; i++) {
                    String firstHalf = Long.toString(i);
                    StringBuilder sb = new StringBuilder(firstHalf);

                    // Make full palindrome
                    String fullPalindrome;
                    if (length % 2 == 0) {
                        fullPalindrome = firstHalf + sb.reverse().toString();
                    } else {
                        fullPalindrome = firstHalf + sb.reverse().substring(1);
                    }

                    long num = Long.parseLong(fullPalindrome);
                    String baseK = convertToBase(num, k);

                    if (isPalindrome(baseK)) {
                        sum += num;
                        n--;
                        if (n == 0) break;
                    }
                }
                length++;
            }

            return sum;
        }

    public static void main(String[] args) {
        int k = 3;
        int n = 5;

        June_23 obj = new June_23();
        Long result = obj.kMirror(k,n);
        System.out.println(result);
    }

}
