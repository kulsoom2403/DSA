import java.util.Stack;

public class Simplify_path {



        public String simplifyPath(String path) {
            String[] str = path.split("/");
            Stack<String> stack = new Stack<>();

            for (int i = 0; i < str.length; i++) {
                if (str[i].equals("") || str[i].equals(".")) {
                    continue;
                } else if (str[i].equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(str[i]);
                }
            }

            if (stack.isEmpty()) {
                return "/";
            }

            StringBuilder result = new StringBuilder();
            while (!stack.isEmpty()) {
                result.insert(0, "/" + stack.pop());
            }

            return result.toString();
        }

    public static void main(String[] args) {
        String path = "/home/user/Documents/../Pictures";
        Simplify_path simple = new Simplify_path();
        String result = simple.simplifyPath(path);
        System.out.println(result);
    }


}
