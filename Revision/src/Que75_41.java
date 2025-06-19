import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Que75_41 {

     public  static class TreeNode {
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

        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if(root == null){
                return result;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty()){
                int size = queue.size();
                for(int i = 0; i < size;i++){
                    TreeNode curr = queue.poll();
                    if(i == size - 1){
                        result.add(curr.val);
                    }
                    if(curr.left != null) queue.offer(curr.left);
                    if(curr.right != null) queue.offer(curr.right);
                }
            }
            return result;

        }

    public static void main(String[] args) {
         TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3);
         root.left.left = new TreeNode(4);
         root.left.left.left = new TreeNode(5);

         Que75_41 obj = new Que75_41();
         List<Integer> result = obj.rightSideView(root);

             System.out.println(result);


    }

}
