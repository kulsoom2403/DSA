public class LongestCommonPrefix {

        public String comman(String s1,String s2) {
            int n = Math.min(s1.length(),s2.length());
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < n;i++) {
                if(s1.charAt(i) == s2.charAt(i)) {
                    sb.append(s1.charAt(i));

                }
                else {
                    break;
                }

            }
            return sb.toString();
        }
        public String longestCommonPrefix(String[] strs) {
            String start = strs[0];

            for(int i = 1; i < strs.length;i++) {
                start = comman(start,strs[i]);
            }
            return start;

        }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String res = obj.longestCommonPrefix(strs);
        System.out.println(res);
    }

}
