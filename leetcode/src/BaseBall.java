import java.util.Stack;

public class BaseBall {



        public int calPoints(String[] operations) {
            Stack<Integer> stack = new Stack<>();

            for (String op : operations) {
                if (op.equals("C")) {
                    if (!stack.isEmpty()) {
                        stack.pop(); // Remove last valid score
                    }
                } else if (op.equals("D")) {
                    if (!stack.isEmpty()) {
                        stack.push(2 * stack.peek()); // Double last valid score
                    }
                } else if (op.equals("+")) {
                    if (stack.size() >= 2) {
                        int top = stack.pop(); // Last valid score
                        int newTop = top + stack.peek(); // Sum of last two scores
                        stack.push(top); // Push back the last score
                        stack.push(newTop); // Push new calculated score
                    }
                } else {
                    stack.push(Integer.parseInt(op)); // Convert string number to integer and push
                }
            }

            // Compute total sum of scores in stack
            int sum = 0;
            for (int score : stack) {
                sum += score;
            }

            return sum;
        }

    public static void main(String[] args) {
        String[] nums ={"2","3","4","C","D","+"};
        BaseBall obj = new BaseBall();
        int res = obj.calPoints(nums);
        System.out.println(res);
    }

}
