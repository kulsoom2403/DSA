class TreeNode {
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


public class Height_Binary_Search_Tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBSTHelper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }


        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);


        node.left = sortedArrayToBSTHelper(nums, left, mid - 1);
        node.right = sortedArrayToBSTHelper(nums, mid + 1, right);

        return node;
    }

        // Helper function to print the tree in preorder
        public void printPreOrder(TreeNode node) {
            if (node == null) return;
            System.out.print(node.val + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }

        public static void main(String[] args) {
           Height_Binary_Search_Tree solution = new Height_Binary_Search_Tree();
            int[] nums = {-10, -3, 0, 5, 9};
            TreeNode root = solution.sortedArrayToBST(nums);

            // Print the tree in pre-order to see the output
            solution.printPreOrder(root); // Expected output: -10 -3 0 5 9
        }


}
