import java.util.Stack;

public class Que75_23 {

        public String removeStars(String s) {
            int n = s.length();
            Stack<String> stack = new Stack<>();
            for(int i = 0; i < n;i++){
                if(s.charAt(i) != '*'){
                    stack.push(String.valueOf(s.charAt(i)));

                }
                else{
                    stack.pop();

                }
            }
            StringBuilder sb = new StringBuilder();
            for(String str:stack){
                sb.append(str);
            }
            return sb.toString();

        }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        Que75_23 obj = new Que75_23();
        String result = obj.removeStars(s);
        System.out.println(result);
    }

}
