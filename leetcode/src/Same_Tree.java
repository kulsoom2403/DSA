public class Same_Tree {

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


        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p == null && q == null) {
                return true;
            }
            if(p == null || q == null) {
                return false;
            }
            if(p.val != q.val) {
                return false;
            }
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        }


    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);

        p.right = new TreeNode(6);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);

        q.right = new TreeNode(6);

        Same_Tree same = new Same_Tree();
        boolean res = same.isSameTree(p,q);
        System.out.println(res);



    }
}
