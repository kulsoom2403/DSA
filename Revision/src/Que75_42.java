import java.util.LinkedList;
import java.util.Queue;

public class Que75_42 {

     public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }


        public int maxLevelSum(TreeNode root) {
            if (root == null) {
                return 1;
            }

            int level = 1;
            int maxLevel = 1;
            int max = Integer.MIN_VALUE;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int size = queue.size();
                int sum = 0;  // Reset sum for each level

                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    sum += curr.val;

                    if (curr.left != null) queue.offer(curr.left);
                    if (curr.right != null) queue.offer(curr.right);
                }

                if (sum > max) {
                    max = sum;
                    maxLevel = level;
                }

                level++; // go to next level
            }

            return maxLevel;
        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-1);

        Que75_42 obj = new Que75_42();
        int result = obj.maxLevelSum(root);
        System.out.println(result);
    }


}
