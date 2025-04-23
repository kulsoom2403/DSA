public class Ques75_3 {

        public String reverseWords(String s) {
            String[] words = s.split ( " +" );
            StringBuilder sb = new StringBuilder ();
            for (int i = words.length - 1; i >= 0; i--) {
                sb.append ( words[i] );
                sb.append ( " " );
            }
            return sb.toString ().trim ();

        }

    public static void main(String[] args) {
        String s ="the sky is blue";
        Ques75_3 obj = new Ques75_3();
        String result = obj.reverseWords(s);
        System.out.println(result);
    }
}
