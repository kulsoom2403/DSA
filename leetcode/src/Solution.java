import java.util.*;
public class Solution {
    public  static boolean valid(String s) {
        Stack <Character>  stack =new Stack <Character> ();
        for(int i = 0 ; i < s.length(); i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                stack.push(c);
            if(stack.isEmpty() || c==')' && stack.peek()!='(' || c=='}' && stack.peek()!='{' || c==']' && stack.peek()!='[')
                return false;
            if(c==')' && stack.peek()=='(' || c=='}' && stack.peek()=='{' || c==']' && stack.peek()=='[')
                stack.pop();



        }
        return stack.isEmpty()? true :false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()) {
            String input=sc.next();

            System.out.println(valid(input));

        }

    }

}
