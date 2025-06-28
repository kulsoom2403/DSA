import java.util.ArrayList;
import java.util.List;

public class Preorder {

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


        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            preorder(root,result);
            return result;
        }
        public void preorder(TreeNode root,List<Integer> result){
            if(root == null){
                return;
            }
            result.add(root.val);
            preorder(root.left,result);
            preorder(root.right,result);
        }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Preorder obj = new Preorder();
        List<Integer> result = obj.preorderTraversal(root);
        System.out.println(result);
    }
}
