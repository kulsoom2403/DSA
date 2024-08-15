import java.util.Scanner;
import java.util.Stack;

public class Paranthisis {
    public static boolean isvalid(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0 ;i < s.length(); i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            if(stack.isEmpty() || c==')' && stack.peek()!='(' || c=='}' && stack.peek()!='{' || c==']' && stack.peek()!='['){
                return false;
            }
            if(c==')' && stack.peek()=='(' || c=='}' && stack.peek()=='{' || c==']'&& stack.peek()=='['){
                stack.pop();
            }
        }
        return stack.isEmpty()? true :false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(isvalid(s));
    }
}
