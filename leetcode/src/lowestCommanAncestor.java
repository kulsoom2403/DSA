// TreeNode class definition
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

// Solution class containing the lowestCommonAncestor method
class lca {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        } else if (root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        } else {
            return root;
        }
    }
}

// Main class to test the code
 public class lowestCommanAncestor {
    public static void main(String[] args) {
        // Construct the binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        // Create instances of p and q
        TreeNode p = root.left; // Node with value 5
        TreeNode q = root.left.right.right; // Node with value 4

        // Call the lowestCommonAncestor method
        lca solution = new lca();
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);

        // Print the result
        System.out.println("Lowest Common Ancestor of nodes " + p.val + " and " + q.val + " is: " + lca.val);
    }
}
