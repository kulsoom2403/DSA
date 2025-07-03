import java.util.LinkedList;
import java.util.Queue;

public class Minimum_depth {

      public class TreeNode {
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


        public int minDepth(TreeNode root) {
            int count  = 1;
            if(root == null){
                return 0;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                int level = queue.size();
                for(int i = 0;i < level;i++){
                    TreeNode curr = queue.poll();

                    if(curr.left == null && curr.right == null){
                        return count;
                    }


                    if(curr.left != null){
                        queue.add(curr.left);
                    }
                    if(curr.right != null){
                        queue.add(curr.right);
                    }
                }
                count++;
            }
            return count;
        }

}

