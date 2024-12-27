public class Is_subsequence {

        public boolean isSubsequence(String s, String t) {
            int sl = s.length();
            int tl = t.length();
            int i = 0, j = 0;


            while (i < sl && j < tl) {
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                }
                j++;
            }


            return i == sl;
        }

    public static void main(String[] args) {
        String a = "abc";
        String b = " abdfsfsc";
        Is_subsequence obj = new Is_subsequence();
        boolean re = obj.isSubsequence(a,b);
        System.out.println(re);
    }


}
