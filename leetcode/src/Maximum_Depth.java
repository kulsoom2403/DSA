  class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1() {}
      TreeNode1(int val) { this.val = val; }
      TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Maximum_Depth {
    public int max_find(TreeNode1 root) {
        if(root == null) {
            return 0;
        }
        return Math.max((max_find(root.left)),(max_find(root.right))) + 1;

    }

    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
//        root.right = new TreeNode(3);
        root.left.left = new TreeNode1(4);
        root.left.right = new TreeNode1(5);
        root.right = new TreeNode1(6);
        root.right.left = new TreeNode1(10);
        root.right.right = new TreeNode1(20);

        Maximum_Depth m = new Maximum_Depth();
        int depth = m.max_find(root);
        System.out.println(depth);


    }
}
