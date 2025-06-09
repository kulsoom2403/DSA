public class Que75_38 {

      public  static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null || root == p || root == q) {
                return root;
            }
            TreeNode left = lowestCommonAncestor(root.left,p,q);
            TreeNode right = lowestCommonAncestor(root.right,p,q);

            if( left != null && right != null) {
                return root;
            }
            if(left != null) {
                return left;
            }
            else {
                return right;
            }
        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(9);
         TreeNode p = root.left;
         TreeNode q = root.left.left;

         Que75_38 obj = new Que75_38();
         TreeNode result = obj.lowestCommonAncestor(root,p,q);
        System.out.println(result.val);


    }


}
