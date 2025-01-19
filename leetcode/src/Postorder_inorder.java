import java.util.HashMap;

public class Postorder_inorder {

    // TreeNode class definition
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        // Constructor
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hm.put(inorder[i], i);  // Store inorder element indices
        }

        return buildTreeHelper(inorder, postorder, 0, postorder.length - 1, 0, inorder.length - 1, hm);
    }

    // Helper function to build the tree recursively
    public TreeNode buildTreeHelper(int[] inorder, int[] postorder,
                                    int poststart, int postend,
                                    int inorderStart, int inorderEnd,
                                    HashMap<Integer, Integer> hm) {

        if (poststart > postend || inorderStart > inorderEnd) {
            return null;
        }

        // Root value is the last element in postorder
        int rootValue = postorder[postend];

        TreeNode root = new TreeNode(rootValue);

        // Find the root's index in inorder array
        int inorderIndex = hm.get(rootValue);

        // Size of the left subtree
        int leftTreeSize = inorderIndex - inorderStart;

        // Recursively build left subtree
        root.left = buildTreeHelper(inorder, postorder, poststart, poststart + leftTreeSize - 1, inorderStart, inorderIndex - 1, hm);

        // Recursively build right subtree
        root.right = buildTreeHelper(inorder, postorder, poststart + leftTreeSize, postend - 1, inorderIndex + 1, inorderEnd, hm);

        return root;
    }

    // Function to perform inorder traversal
    public void inorderTraversal(TreeNode root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    // Main method to test the tree building
    public static void main(String[] args) {
        int[] postorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Postorder_inorder post = new Postorder_inorder();

        // Build the tree
        TreeNode root = post.buildTree(postorder, inorder);

        // Inorder traversal of the constructed tree
        System.out.print("Inorder Traversal of the constructed tree: ");
        post.inorderTraversal(root);
    }
}
