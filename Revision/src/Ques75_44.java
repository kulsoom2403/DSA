public class Ques75_44 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node to be deleted found
            if (root.left != null && root.right != null) {
                int maxVal = findMax(root.left);
                root.val = maxVal;
                root.left = deleteNode(root.left, maxVal);
            } else if (root.left != null) {
                return root.left;
            } else if (root.right != null) {
                return root.right;
            } else {
                return null;
            }
        }
        return root;
    }

    private int findMax(TreeNode node) {
        while (node.right != null) {
            node = node.right;
        }
        return node.val;
    }

    // Inorder Traversal: left → root → right
    public static void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(9);

        int k = 3; // Node to delete

        Ques75_44 obj = new Ques75_44();
        TreeNode result = obj.deleteNode(root, k);

        System.out.println("Inorder traversal after deleting node " + k + ":");
        inorder(result);
        System.out.println(); // newline
    }
}
