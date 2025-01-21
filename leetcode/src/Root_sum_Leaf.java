public class Root_sum_Leaf {
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

    int sum =0;

    public void sumNum(TreeNode node ,int num) {
        num = num * 10 + node.val;

        if (node.left == null && node.right == null) {
            sum = sum + num;
            return;
        }
        if (node.left != null) {
            sumNum(node.left, num);
        }
        if (node.right != null) {
            sumNum(node.right, num);
        }
    }

    public int sumNumbers(TreeNode root) {
        sumNum(root,0);
        return sum;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);

        Root_sum_Leaf sumroot = new Root_sum_Leaf();
         int res =  sumroot.sumNumbers(root);
        System.out.println(res);

    }


}
