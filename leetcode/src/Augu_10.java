public class Augu_10 {

        private boolean found = false;
        private boolean isPowerOfTwo(int n) {
            if (n <= 0) return false;
            while (n > 1) {
                if (n % 2 != 0) {
                    return false;
                }
                n = n / 2;
            }
            return true;
        }

        private void permute(String str, int l, int r) {
            if (found) return;

            if (l == r) {
                if (str.charAt(0) != '0') {
                    int val = Integer.parseInt(str);
                    if (isPowerOfTwo(val)) {
                        found = true;
                    }
                }
            } else {
                for (int i = l; i <= r; i++) {
                    str = swap(str, l, i);
                    permute(str, l + 1, r);
                    str = swap(str, l, i);
                }
            }
        }

        private String swap(String a, int i, int j) {
            char[] charArray = a.toCharArray();
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }

        public boolean reorderedPowerOf2(int n) {
            String str = String.valueOf(n);
            found = false;
            permute(str, 0, str.length() - 1);
            return found;
        }

    public static void main(String[] args) {
        int n = 10;
        Augu_10 obj = new Augu_10();
        boolean result = obj.isPowerOfTwo(n);
        System.out.println(result);
    }
}
