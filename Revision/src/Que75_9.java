public class Que75_9 {

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
        String s ="abc";
        String t ="ahbgdc";

        Que75_9 obj = new Que75_9();
        Boolean res = obj.isSubsequence(s,t);
        System.out.println(res);
    }

}
