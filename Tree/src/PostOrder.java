import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public class PostOrder {

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


        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer>  result = new ArrayList<>();
            postorder(result,root);
            return result;

        }
        public void postorder(List<Integer> result ,TreeNode root){
            if(root == null){
                return;
            }
            postorder(result,root.left);
            postorder(result,root.right);
            result.add(root.val);


        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(8);

        PostOrder obj = new PostOrder();
        List<Integer> result = obj.postorderTraversal(root);
        System.out.println(result);
    }
}
