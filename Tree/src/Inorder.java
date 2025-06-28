import java.util.ArrayList;
import java.util.List;

public class Inorder {

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


      public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            inorder(result,root);
            return result;
        }

        public void inorder(List<Integer> result,TreeNode root) {
            if(root == null) {
                return;
            }
            inorder(result,root.left);
            result.add(root.val);
            inorder(result,root.right);






        }

    public static void main(String[] args) {
          TreeNode root = new TreeNode(1);
          root.left = new TreeNode(2);
          root.right = new TreeNode(3);

          Inorder obj = new Inorder();
          List<Integer> result = obj.inorderTraversal(root);
        System.out.println(result);

    }
}
