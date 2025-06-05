public class Que75_37 {


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


        public int goodNodes(TreeNode root) {
            return dfs(root,root.val);

        }
        private int dfs(TreeNode node,int max){
            if(node == null){
                return 0;
            }int count = 0;
            if(node.val >= max){
                max = Math.max(max,node.val);
                count = 1;
            }
            count += dfs(node.left,max);
            count += dfs(node.right,max);

            return count;
        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.right.right = new TreeNode(2);
        root.left.right = new TreeNode(1);

        Que75_37 obj = new Que75_37();
        int result = obj.goodNodes(root);
        System.out.println(result);
    }
}
