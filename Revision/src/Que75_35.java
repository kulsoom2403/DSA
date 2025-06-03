public class Que75_35 {


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


        public int maxDepth(TreeNode root) {

            if(root == null) {
                return 0;
            }
            return Math.max((maxDepth(root.left)),(maxDepth(root.right))) + 1;

        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.left.left = new TreeNode(6);

        Que75_35 obj = new Que75_35();
        int result = obj.maxDepth(root);
        System.out.println(result);


    }
}
