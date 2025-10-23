import java.util.Locale;

public class oct_23 {

        public boolean hasSameDigits(String s) {
            char[] arr = s.toCharArray();
            int n = arr.length;
            while (n > 2) {
                for (int i = 0; i < n - 1; i++) {
                    arr[i] = (char)(((arr[i] - '0' + arr[i + 1] - '0') % 10) + '0');
                }
                n--;
            }
            return arr[0] == arr[1];
        }

    public static void main(String[] args) {
        String s = "3879";
        oct_23 obj = new oct_23();
        boolean result = obj.hasSameDigits(s);
        System.out.println(result);

    }
}
