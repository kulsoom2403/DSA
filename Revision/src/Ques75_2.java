public class Ques75_2 {

        public String gcdOfStrings(String str1, String str2) {
            int m = str1.length();
            int n = str2.length();

            if(!(str1+str2).equals(str2+str1)) {
                return "";

            }
            String result = str1.substring(0,gcd(m,n));
            return result;
        }

        private int  gcd(int m,int n) {
            if(n== 0) {
                return m;
            }
            return gcd(n,m % n);
        }


    public static void main(String[] args) {
        String str1 ="ABCABC";
        String str2="ABC";

        Ques75_2 obj = new Ques75_2();
        String res = obj.gcdOfStrings(str1,str2);
        System.out.println(res);
    }
}
