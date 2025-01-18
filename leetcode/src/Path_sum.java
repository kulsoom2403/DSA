public class Path_sum {


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


        public boolean hasPathSum(TreeNode root, int targetSum) {

            if(root == null ) {
                return false;
            }
            if(root.left == null && root.right == null){
                return root.val == targetSum;
            }


            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);


        }

    public static void main(String[] args) {
        int targetSum = 22;
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.left = new TreeNode(1);

        Path_sum path = new Path_sum();
        Boolean res = path.hasPathSum(root,targetSum);
        System.out.println(res);




    }

}
