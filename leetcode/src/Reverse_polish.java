import java.util.Stack;

public class Reverse_polish {

        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            String operator = "+-*/";
            for(String token : tokens){
                if(operator.indexOf(token) != -1){


                    int n2 = stack.pop();
                    int n1 = stack.pop();
                    int result = 0;

                    if(token.equals("+")){
                        result = n1 + n2;
                    }
                    else if(token.equals("-")){
                        result = n1 - n2;
                    }
                    else if(token.equals("*")){
                        result = n1 * n2;
                    }
                    else  if(token.equals("/")){
                        result = n1 / n2;
                    }
                    stack.push(result);
                }
                else{
                    stack.push(Integer.parseInt(token));
                }


            }
            return stack.peek();

        }

    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        Reverse_polish rp = new Reverse_polish();
        int calculate = rp.evalRPN(tokens);
        System.out.println(calculate);
    }
    }

