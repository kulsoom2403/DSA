import java.util.Stack;

public class Que75_27 {

        public String decodeString(String s) {
            Stack<Integer> st = new Stack<>();
            Stack<StringBuilder> st1 = new Stack<>();
            StringBuilder sb = new StringBuilder();
            int n = 0;

            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    n = n * 10 + (c - '0');
                } else if (c == '[') {
                    st.push(n);
                    n = 0;
                    st1.push(sb);
                    sb = new StringBuilder();
                } else if (c == ']') {
                    int k = st.pop();
                    StringBuilder temp = sb;
                    sb = st1.pop();
                    while (k-- > 0) {
                        sb.append(temp);
                    }
                } else {
                    sb.append(c);
                }
            }

            return sb.toString();
        }

    public static void main(String[] args) {
        String s ="2[a3[c2[f]]]";
        Que75_27 obj = new Que75_27();
        String result = obj.decodeString(s);
        System.out.println(result);
    }

}
