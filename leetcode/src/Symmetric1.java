public class Symmetric1 {

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


        public boolean isSymmetric(TreeNode root) {
            if(root == null) {
                return true;
            }
            return Symmetric(root.left,root.right);
        }
        private boolean Symmetric(TreeNode p,TreeNode q) {
            if(p == null && q == null) {
                return true;
            }
            if(p == null || q == null) {
                return false;
            }
            return (p.val == q.val) && Symmetric(p.left,q.right) && Symmetric(p.right,q.left);



        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right  = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Symmetric1 symmetric = new Symmetric1();
        boolean result = symmetric.isSymmetric(root);
        System.out.println(result);

    }
}
