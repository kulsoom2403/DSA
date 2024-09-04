// TreeNode class definition
class TreeNode {
    int val;
    Tnode left;
    Tnode right;

    TreeNode(int x) {
        val = x;
    }
}

// Solution class containing the lowestCommonAncestor method
class lca {
    public Tnode lowestCommonAncestor(Tnode root, Tnode p, Tnode q) {
        if (root == null) {
            return null;
        } else if (root == p || root == q) {
            return root;
        }

        Tnode left = lowestCommonAncestor(root.left, p, q);
        Tnode right = lowestCommonAncestor(root.right, p, q);

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
        Tnode root = new Tnode(3);
        root.left = new Tnode(5);
        root.right = new Tnode(1);
        root.left.left = new Tnode(6);
        root.left.right = new Tnode(2);
        root.right.left = new Tnode(0);
        root.right.right = new Tnode(8);
        root.left.right.left = new Tnode(7);
        root.left.right.right = new Tnode(4);

        // Create instances of p and q
        Tnode p = root.left; // Node with value 5
        Tnode q = root.left.right.right; // Node with value 4

        // Call the lowestCommonAncestor method
        lca solution = new lca();
        Tnode lca = solution.lowestCommonAncestor(root, p, q);

        // Print the result
        System.out.println("Lowest Common Ancestor of nodes " + p.val + " and " + q.val + " is: " + lca.val);
    }
}
