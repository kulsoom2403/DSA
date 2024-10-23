import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class TreeNode {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Binary_tree_traversal {
    public List<List<Integer>> levelOrder(TreeNode1 root) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode1> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelValues = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode1 current = queue.poll();
                levelValues.add(current.val);

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            res.add(levelValues);
        }

        return res;
    }

    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);
        root.left.left = new TreeNode1(4);
        root.left.right = new TreeNode1(5);

        // Create Binary_tree_traversal object and call levelOrder method
        Binary_tree_traversal solution = new Binary_tree_traversal();
        List<List<Integer>> levels = solution.levelOrder(root);

        // Print the result
        for (int i = 0; i < levels.size(); i++) {
            System.out.println("Level " + i + ": " + levels.get(i));
        }
    }
}
