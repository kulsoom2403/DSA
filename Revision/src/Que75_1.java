public class Que75_1 {

        public String mergeAlternately(String word1, String word2) {
            StringBuilder str = new StringBuilder();
            int n = word1.length();
            int m = word2.length();

            int i = 0;
            int j = 0;

            while(i < n || j < m) {
                if(i < n) {
                    str.append(word1.charAt(i++));

                }
                if(j < m) {
                    str.append(word2.charAt(j++));
                }
            }
            return str.toString();

        }

    public static void main(String[] args) {
        String word1 = "umme";
        String word2 = "kulsoom";

        Que75_1 obj = new Que75_1();
        String result = obj.mergeAlternately(word1, word2);
        System.out.println(result);
    }
}
