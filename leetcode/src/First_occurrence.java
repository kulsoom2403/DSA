public class First_occurrence {

        public int strStr(String haystack, String needle) {

            if (needle.isEmpty()) {
                return 0;
            }

            int h = haystack.length();

            int n = needle.length();


            for(int i = 0; i <= h - n; i ++) {

                if(haystack.substring(i,i + n).equals(needle)) {

                    return i;
                }

            }
            return -1;

        }

    public static void main(String[] args) {
            First_occurrence obj = new First_occurrence();
            int result =  obj.strStr("leetcode","leet");
            System.out.println(result);
    }



}
