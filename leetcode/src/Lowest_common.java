public class Lowest_common {


      public static class TreeNode {
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
        public TreeNode common(TreeNode root,int val) {
          if(root == null) {
              return null;
          }
          if(root.val == val) {
              return root;
          }
          TreeNode left = common(root.left,val);
          if(left != null) {
              return left;
          }
          return common(root.right,val);

        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left= new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        int p = 7;
        int q =8;

        Lowest_common lowest = new Lowest_common();
        TreeNode pval = lowest.common(root,p);
        TreeNode qval = lowest.common(root,q);

        TreeNode result = lowest.lowestCommonAncestor(root,pval,qval);
        if(result != null) {
            System.out.println("The LCA of nodes " + p + " and " + q + " is: " + result.val);
        }
        else {
            System.out.println("Not found");
        }


    }


}
