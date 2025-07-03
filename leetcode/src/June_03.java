public class June_03
{

        public char kthCharacter(int k) {
            StringBuilder sb = new StringBuilder("a");
            while (sb.length() < k) {
                int size = sb.length();
                for (int i = 0; i < size; i++) {
                    sb.append((char) ('a' + ((sb.charAt(i) - 'a') + 1) % 26));
                }
            }
            return sb.charAt(k - 1);
        }

    public static void main(String[] args) {
        int k = 4;
        June_03 obj = new June_03();
        char result = obj.kthCharacter(k);
        System.out.println(result);
    }
}
